package org.bing.serviceconsume.service;

import org.bing.serviceconsume.dao.UserRepository;
import org.bing.serviceconsume.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author sunyibing
 * @date 2024/4/9
 */
@Service
public class ConsumeService {

    @Resource
    private UserRepository userRepository;
    public void run (){
        User user = userRepository.findUserById("1");
        System.out.println("输出用户名称："+user.getName());
    }
}
