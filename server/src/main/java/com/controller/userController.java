package com.controller;

import com.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import common.Result;
import pojo.entity.User;

@RestController
@RequestMapping("/user")
@Slf4j
public class userController {

    @Autowired
    private UserService userServiceImpl;

    @GetMapping
    public Result<User> showUser() {
        log.info("用户访问正在访问个人首页");
        User user = userServiceImpl.showUser();
        return Result.success(user);
    }
}
