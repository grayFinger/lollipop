package com.lollipop.system.api.domain.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.lollipop.common.core.annotation.Excel;
import com.lollipop.common.core.web.tenant.base.TSubTreeEntity;


/**
 * 素材分类 持久化对象
 *
 * @param <D> Dto
 * @param <S> SubDto
 * @author lollipop
 */
public class SysMaterialFolderPo<D,S> extends TSubTreeEntity<D,S> {

    private static final long serialVersionUID = 1L;

    /** 分类类型 0默认文件夹 1系统文件夹 */
    @Excel(name = "分类类型", readConverterExp = "0=默认文件夹,1=系统文件夹")
    @TableField("type")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
