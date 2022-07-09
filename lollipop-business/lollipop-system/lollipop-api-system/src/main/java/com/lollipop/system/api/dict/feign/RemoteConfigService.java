package com.lollipop.system.api.dict.feign;

import com.lollipop.common.core.constant.basic.ServiceConstants;
import com.lollipop.common.core.domain.R;
import com.lollipop.system.api.dict.feign.factory.RemoteConfigFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 参数服务
 *
 * @author lollipop
 */
@FeignClient(contextId = "remoteConfigService", value = ServiceConstants.SYSTEM_SERVICE, fallbackFactory = RemoteConfigFallbackFactory.class)
public interface RemoteConfigService {

    /**
     * 查询参数
     *
     * @param configCode 参数编码
     * @return 结果
     */
    @GetMapping("/config/innerCode/{configCode}")
    R<String> getCode(@PathVariable("configCode") String configCode);
}