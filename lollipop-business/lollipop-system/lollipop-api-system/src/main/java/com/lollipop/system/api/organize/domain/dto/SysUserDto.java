package com.lollipop.system.api.organize.domain.dto;

import cn.hutool.core.util.StrUtil;
import com.lollipop.common.core.constant.system.AuthorityConstants;
import com.lollipop.common.core.web.validate.V_A_E;
import com.lollipop.system.api.authority.domain.dto.SysRoleDto;
import com.lollipop.system.api.organize.domain.po.SysUserPo;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 用户 数据传输对象
 *
 * @author e9
 */
public class SysUserDto extends SysUserPo {

    private static final long serialVersionUID = 1L;

    /** 岗位对象 */
    private List<SysPostDto> posts;

    /** 角色对象 */
    private List<SysRoleDto> roles;

    /** 岗位组 */
    private Long[] postIds;

    /** 角色组 */
    private Long[] roleIds;

    /** 岗位Id - 查询 */
    private Long postId;

    /** 部门Id - 查询 */
    private Long deptId;

    public List<SysPostDto> getPosts() {
        return posts;
    }

    public void setPosts(List<SysPostDto> posts) {
        this.posts = posts;
    }

    public List<SysRoleDto> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRoleDto> roles) {
        this.roles = roles;
    }

    @NotEmpty(message = "归属岗位不能为空", groups = {V_A_E.class})
    public Long[] getPostIds() {
        return postIds;
    }

    public void setPostIds(Long[] postIds) {
        this.postIds = postIds;
    }

    public Long[] getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(Long[] roleIds) {
        this.roleIds = roleIds;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public boolean isNotAdmin() {
        return !isAdmin(this.getUserType());
    }

    public boolean isAdmin() {
        return isAdmin(this.getUserType());
    }

    public static boolean isNotAdmin(String userType) {
        return !isAdmin(userType);
    }

    public static boolean isAdmin(String userType) {
        return StrUtil.equals(AuthorityConstants.UserType.ADMIN.getCode(), userType);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("userCode", getCode())
                .append("userName", getUserName())
                .append("nickName", getNickName())
                .append("phone", getPhone())
                .append("email", getEmail())
                .append("sex", getSex())
                .append("posts", getPosts())
                .append("postIds", getPostIds())
                .append("postId", getPostId())
                .append("deptId", getDeptId())
                .append("roles", getRoles())
                .append("avatar", getAvatar())
                .append("profile", getProfile())
                .append("password", getPassword())
                .append("loginIp", getLoginIp())
                .append("loginDate", getLoginDate())
                .append("sort", getSort())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createName", getCreateName())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateName", getUpdateName())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
