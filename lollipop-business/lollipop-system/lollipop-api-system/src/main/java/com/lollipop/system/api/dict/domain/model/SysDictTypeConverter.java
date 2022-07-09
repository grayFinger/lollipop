package com.lollipop.system.api.dict.domain.model;

import com.lollipop.common.core.web.entity.model.SubBaseConverter;
import com.lollipop.system.api.dict.domain.dto.SysDictTypeDto;
import com.lollipop.system.api.dict.domain.po.SysDictTypePo;
import com.lollipop.system.api.dict.domain.query.SysDictTypeQuery;
import org.mapstruct.Mapper;

/**
 * 字典类型 对象映射器
 *
 * @author lollipop
 */
@Mapper(componentModel = "spring")
public interface SysDictTypeConverter extends SubBaseConverter<SysDictTypeQuery, SysDictTypeDto, SysDictTypePo> {
}
