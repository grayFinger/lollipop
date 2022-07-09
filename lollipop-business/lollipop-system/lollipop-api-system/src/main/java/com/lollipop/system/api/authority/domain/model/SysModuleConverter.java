package com.lollipop.system.api.authority.domain.model;

import com.lollipop.common.core.web.entity.model.SubBaseConverter;
import com.lollipop.system.api.authority.domain.dto.SysModuleDto;
import com.lollipop.system.api.authority.domain.po.SysModulePo;
import com.lollipop.system.api.authority.domain.query.SysModuleQuery;
import org.mapstruct.Mapper;

/**
 * 模块 对象映射器
 *
 * @author e9
 */
@Mapper(componentModel = "spring")
public interface SysModuleConverter extends SubBaseConverter<SysModuleQuery, SysModuleDto, SysModulePo> {
}
