package com.lollipop.system.api.authority.domain.dto;

import com.lollipop.system.api.authority.domain.po.SysRolePo;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 角色 数据传输对象
 *
 * @author e9
 */
public class SysRoleDto extends SysRolePo {

    private static final long serialVersionUID = 1L;

    /** 权限Ids（菜单权限） */
    private Long[] authIds;

    /** 组织Ids（数据权限） */
    private Long[] organizeIds;

    public Long[] getAuthIds() {
        return authIds;
    }

    public void setAuthIds(Long[] authIds) {
        this.authIds = authIds;
    }

    public Long[] getOrganizeIds() {
        return organizeIds;
    }

    public void setOrganizeIds(Long[] organizeIds) {
        this.organizeIds = organizeIds;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("code", getCode())
                .append("name", getName())
                .append("roleKey", getRoleKey())
                .append("dataScope", getDataScope())
                .append("sort", getSort())
                .append("status", getStatus())
                .append("remark", getRemark())
                .append("createBy", getCreateBy())
                .append("createName", getCreateName())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateName", getUpdateName())
                .append("updateTime", getUpdateTime())
                .append("authIds", getAuthIds())
                .append("organizeIds", getOrganizeIds())
                .toString();
    }
}
