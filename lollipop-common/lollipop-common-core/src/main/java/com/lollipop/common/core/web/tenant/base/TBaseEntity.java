package com.lollipop.common.core.web.tenant.base;

import com.baomidou.mybatisplus.annotation.TableField;
import com.lollipop.common.core.web.entity.base.BaseEntity;

/**
 * Base 租户基类
 *
 * @author xueyi
 */
public class TBaseEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** 租户Id */
    @TableField(exist = false)
    private Long enterpriseId;

    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
}
