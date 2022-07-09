package com.lollipop.system.api.organize.domain.model;

import com.lollipop.common.core.web.entity.model.BaseConverter;
import com.lollipop.system.api.organize.domain.dto.SysEnterpriseDto;
import com.lollipop.system.api.organize.domain.po.SysEnterprisePo;
import com.lollipop.system.api.organize.domain.query.SysEnterpriseQuery;
import org.mapstruct.Mapper;

/**
 * 企业 对象映射器
 *
 * @author lollipop
 */
@Mapper(componentModel = "spring")
public interface SysEnterpriseConverter extends BaseConverter<SysEnterpriseQuery, SysEnterpriseDto, SysEnterprisePo> {
}
