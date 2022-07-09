package com.lollipop.system.api.organize.domain.model;

import com.lollipop.common.core.web.entity.model.BaseConverter;
import com.lollipop.system.api.organize.domain.dto.SysUserDto;
import com.lollipop.system.api.organize.domain.po.SysUserPo;
import com.lollipop.system.api.organize.domain.query.SysUserQuery;
import org.mapstruct.Mapper;

/**
 * 用户 对象映射器
 *
 * @author lollipop
 */
@Mapper(componentModel = "spring")
public interface SysUserConverter extends BaseConverter<SysUserQuery, SysUserDto, SysUserPo> {
}
