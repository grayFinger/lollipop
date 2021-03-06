package com.lollipop.common.web.entity.mapper;


import com.lollipop.common.core.web.entity.base.BaseEntity;
import com.lollipop.common.core.web.entity.base.SubBaseEntity;

/**
 * 数据层 主子基类通用数据处理
 *
 * @param <Q>  Query
 * @param <D>  Dto
 * @param <P>  Po
 * @param <SQ> SubQuery
 * @param <SD> SubDto
 * @param <SP> SubPo
 * @author xueyi
 */
public interface SubBaseMapper<Q extends P, D extends P, P extends SubBaseEntity<SD>, SQ extends SP, SD extends SP, SP extends BaseEntity> extends BaseMapper<Q, D, P> {
}
