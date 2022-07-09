package com.lollipop.system.api.organize.domain.model;

import com.lollipop.common.core.web.entity.model.SubTreeConverter;
import com.lollipop.system.api.organize.domain.dto.SysDeptDto;
import com.lollipop.system.api.organize.domain.po.SysDeptPo;
import com.lollipop.system.api.organize.domain.query.SysDeptQuery;
import org.mapstruct.Mapper;

/**
 * 部门 对象映射器
 *
 * @author lollipop
 */
@Mapper(componentModel = "spring")
public interface SysDeptConverter extends SubTreeConverter<SysDeptQuery, SysDeptDto, SysDeptPo> {
}
