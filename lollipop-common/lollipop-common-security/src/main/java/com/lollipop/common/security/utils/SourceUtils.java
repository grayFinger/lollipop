package com.lollipop.common.security.utils;

import com.e9.cloud.lettuce.redis.service.RedisService;
import com.lollipop.common.core.constant.basic.CacheConstants;
import com.lollipop.common.core.utils.SpringUtils;
import com.lollipop.system.api.source.domain.Source;

import java.io.Serializable;

/**
 * 源策略组缓存管理工具类
 *
 * @author lollipop
 */
public class SourceUtils {

    /**
     * 源策略组查询
     *
     * @param Id 源策略组Id
     */
    public static Source getSourceCache(Serializable Id) {
        return SpringUtils.getBean(RedisService.class).getCacheMapValue(CacheConstants.DATA_SOURCE_KEY, Id.toString());
    }
}