package com.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import common.Result;

@RestController
@RequestMapping
@Slf4j
public class testController {

    @GetMapping("/test")
    public Result test(){
        log.info("test()方法正在运行....");
        return Result.success();
    }
}
