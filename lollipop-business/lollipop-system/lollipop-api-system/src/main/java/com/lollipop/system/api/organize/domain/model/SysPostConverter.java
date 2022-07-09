package com.lollipop.system.api.organize.domain.model;

import com.lollipop.common.core.web.entity.model.BaseConverter;
import com.lollipop.system.api.organize.domain.dto.SysPostDto;
import com.lollipop.system.api.organize.domain.po.SysPostPo;
import com.lollipop.system.api.organize.domain.query.SysPostQuery;
import org.mapstruct.Mapper;

/**
 * 岗位 对象映射器
 *
 * @author lollipop
 */
@Mapper(componentModel = "spring")
public interface SysPostConverter extends BaseConverter<SysPostQuery, SysPostDto, SysPostPo> {
}
