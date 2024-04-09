package org.bing.serviceconsume.controller;

import org.bing.serviceconsume.service.ConsumeService;
import org.bing.serviceconsume.service.RemoteConsume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author sunyibing
 * @date 2024/4/9
 */
@RestController
@RequestMapping(path = "/consume")
public class ConsumeController {

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private ConsumeService consumeService;
    @Autowired
    private RemoteConsume remoteConsume;
    @GetMapping(path = "/welcome")
    public String run(){
        consumeService.run();
        return remoteConsume.remoteConsume();
//        return restTemplate.getForObject("http://service-provider/provider/welcome", String.class);
    }
}
