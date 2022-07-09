package com.lollipop.system.api.dict.domain.model;

import com.lollipop.common.core.web.entity.model.BaseConverter;
import com.lollipop.system.api.dict.domain.dto.SysConfigDto;
import com.lollipop.system.api.dict.domain.po.SysConfigPo;
import com.lollipop.system.api.dict.domain.query.SysConfigQuery;
import org.mapstruct.Mapper;

/**
 * 参数配置 对象映射器
 *
 * @author lollipop
 */
@Mapper(componentModel = "spring")
public interface SysConfigConverter extends BaseConverter<SysConfigQuery, SysConfigDto, SysConfigPo> {
}
