package com.service.Impl;

import com.service.UserService;
import org.springframework.stereotype.Service;
import pojo.entity.User;

@Service
public class userServiceImpl implements UserService {

    @Override
    public User showUser(){
        User user = new User();
        return user;
    }
}

