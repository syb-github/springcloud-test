package org.bing.serviceprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunyibing
 * @date 2024/4/9
 */
@RestController
@RequestMapping(path = "/provider")
public class ProviderController {

    @GetMapping(path = "/welcome")
    public String run(){
        System.out.println(111);
        return "Hello World";
    }
}
