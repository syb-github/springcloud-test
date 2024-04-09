package org.bing.serviceconsume.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 通过feign注解调用接口   需在启动类上添加注解 @EnableFeignClients
 * @author sunyibing
 * @date 2024/4/9
 */
@FeignClient(name = "service-provider", url = "")
public interface RemoteConsume {

    @RequestMapping("/provider/welcome")
    String remoteConsume();
}
