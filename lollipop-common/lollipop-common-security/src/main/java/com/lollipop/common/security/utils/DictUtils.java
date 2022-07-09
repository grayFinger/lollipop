package com.lollipop.common.security.utils;

import com.e9.cloud.lettuce.redis.service.RedisService;
import com.lollipop.common.core.constant.basic.CacheConstants;
import com.lollipop.common.core.utils.SpringUtils;
import com.lollipop.system.api.dict.domain.dto.SysDictDataDto;

import java.util.Collection;
import java.util.List;

/**
 * 字典缓存管理工具类
 *
 * @author lollipop
 */
public class DictUtils {

    /**
     * 获取字典缓存
     *
     * @param code 字典编码
     * @return 字典数据列表
     */
    public static List<SysDictDataDto> getDictCache(String code) {
        return SpringUtils.getBean(RedisService.class).getCacheMapValue(CacheConstants.SYS_DICT_KEY, code);
    }

    /**
     * 获取多个字典缓存
     *
     * @param codeList 字典编码集合
     * @return 字典数据列表
     */
    public static List<List<SysDictDataDto>> getDictListCache(Collection<Object> codeList) {
        return SpringUtils.getBean(RedisService.class).getMultiCacheMapValue(CacheConstants.SYS_DICT_KEY, codeList);
    }
}
