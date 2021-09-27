package com.bilibili.itlaoge.controller;

import com.bilibili.itlaoge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hw
 * @version 1.0
 * @date 2021-09-22 20:04
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHi(@RequestParam String string) {
        return string;
    }
}
