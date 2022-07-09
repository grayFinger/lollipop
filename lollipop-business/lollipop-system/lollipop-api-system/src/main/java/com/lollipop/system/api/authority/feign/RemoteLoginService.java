package com.lollipop.system.api.authority.feign;

import com.lollipop.common.core.constant.basic.SecurityConstants;
import com.lollipop.common.core.constant.basic.ServiceConstants;
import com.lollipop.common.core.domain.R;
import com.lollipop.system.api.authority.feign.factory.RemoteLoginFallbackFactory;
import com.lollipop.system.api.model.LoginUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * 登录服务
 *
 * @author lollipop
 */
@FeignClient(contextId = "remoteLoginService", value = ServiceConstants.SYSTEM_SERVICE, fallbackFactory = RemoteLoginFallbackFactory.class)
public interface RemoteLoginService {

    /**
     * 查询登录登录信息
     *
     * @param enterpriseName 企业账号
     * @param userName       员工账号
     * @param password       密码
     * @param source         请求来源
     * @return 结果
     */
    @GetMapping("/login/inner/loginInfo/{enterpriseName}/{userName}/{password}")
    R<LoginUser> getLoginInfoInner(@PathVariable("enterpriseName") String enterpriseName, @PathVariable("userName") String userName, @PathVariable("password") String password, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);

}
