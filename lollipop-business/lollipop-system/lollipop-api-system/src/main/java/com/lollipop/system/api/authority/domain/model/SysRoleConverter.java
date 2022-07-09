package com.lollipop.system.api.authority.domain.model;

import com.lollipop.common.core.web.entity.model.BaseConverter;
import com.lollipop.system.api.authority.domain.dto.SysRoleDto;
import com.lollipop.system.api.authority.domain.po.SysRolePo;
import com.lollipop.system.api.authority.domain.query.SysRoleQuery;
import org.mapstruct.Mapper;

/**
 * 角色 对象映射器
 *
 * @author e9
 */
@Mapper(componentModel = "spring")
public interface SysRoleConverter extends BaseConverter<SysRoleQuery, SysRoleDto, SysRolePo> {
}
