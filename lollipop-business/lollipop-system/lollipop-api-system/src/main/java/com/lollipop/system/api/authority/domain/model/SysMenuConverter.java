package com.lollipop.system.api.authority.domain.model;

import com.lollipop.common.core.web.entity.model.TreeConverter;
import com.lollipop.system.api.authority.domain.dto.SysMenuDto;
import com.lollipop.system.api.authority.domain.po.SysMenuPo;
import com.lollipop.system.api.authority.domain.query.SysMenuQuery;
import org.mapstruct.Mapper;

/**
 * 菜单 对象映射器
 *
 * @author e9
 */
@Mapper(componentModel = "spring")
public interface SysMenuConverter extends TreeConverter<SysMenuQuery, SysMenuDto, SysMenuPo> {
}
