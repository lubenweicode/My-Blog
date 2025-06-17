package com.service;

import org.springframework.stereotype.Service;
import pojo.entity.User;

@Service
public interface UserService {

    /**
     * 用户信息
     * @return
     */
    User showUser();
}
