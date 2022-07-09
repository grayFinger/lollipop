package com.lollipop.common.web.entity.service.impl.handle;

import cn.hutool.core.util.ObjectUtil;
import com.lollipop.common.core.constant.basic.BaseConstants;
import com.lollipop.common.core.web.entity.base.BaseEntity;
import com.lollipop.common.core.web.entity.base.SubBaseEntity;
import com.lollipop.common.web.entity.manager.ISubBaseManager;
import com.lollipop.common.web.entity.service.IBaseService;
import com.lollipop.common.web.entity.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Collection;

/**
 * 服务层 操作方法 主子基类实现通用数据处理
 *
 * @param <Q>   Query
 * @param <D>   Dto
 * @param <IDG> DtoIManager
 * @param <SQ>  SubQuery
 * @param <SD>  SubDto
 * @param <ISS> SubIService
 * @author xueyi
 */
public abstract class SubBaseHandleServiceImpl<Q extends SubBaseEntity<SD>, D extends SubBaseEntity<SD>, IDG extends ISubBaseManager<Q, D, SQ, SD>, SQ extends BaseEntity, SD extends BaseEntity, ISS extends IBaseService<SQ, SD>> extends BaseServiceImpl<Q, D, IDG> {

    @Autowired
    protected ISS subService;

    /**
     * 修改/修改状态 主子树型 检查归属数据状态
     * 是否变更，变更则同步禁用归属数据
     *
     * @param id     Id
     * @param status 状态
     * @see com.xueyi.common.web.entity.service.impl.SubBaseServiceImpl#update(SubBaseEntity)
     * @see com.xueyi.common.web.entity.service.impl.SubBaseServiceImpl#updateStatus(Serializable, String)
     */
    protected void UUSHandleSubStatusCheck(Serializable id, String status) {
        D original = baseManager.selectById(id);
        if (!ObjectUtil.equals(original.getStatus(), status)
                && ObjectUtil.equals(BaseConstants.Status.DISABLE.getCode(), status)
                && ObjectUtil.isNotNull(baseManager.checkExistNormalSub(id)))
            baseManager.updateSubStatus(id, BaseConstants.Status.DISABLE.getCode());
    }

    /**
     * 设置子数据的外键值
     *
     * @param subList 子数据集合
     * @param d       数据对象
     */
    protected void setForeignKey(Collection<SD> subList, D d) {
        setForeignKey(subList, null, d, null);
    }

    /**
     * 设置子数据的外键值
     *
     * @param sub 子数据
     * @param d   数据对象
     */
    protected void setForeignKey(SD sub, D d) {
        setForeignKey(null, sub, d, null);
    }

    /**
     * 设置子数据的外键值
     *
     * @param subList    子数据集合
     * @param foreignKey 子表外键值
     */
    protected void setForeignKey(Collection<SD> subList, Serializable foreignKey) {
        setForeignKey(subList, null, null, foreignKey);
    }

    /**
     * 设置子数据的外键值
     *
     * @param sub        子数据
     * @param foreignKey 子表外键值
     */
    protected void setForeignKey(SD sub, Serializable foreignKey) {
        setForeignKey(null, sub, null, foreignKey);
    }

    /**
     * 设置子数据的外键值
     *
     * @param subList    子数据集合
     * @param sub        子数据
     * @param d          数据对象
     * @param foreignKey 子表外键值
     */
    protected abstract void setForeignKey(Collection<SD> subList, SD sub, D d, Serializable foreignKey);
}
