package com.husky.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author husky
 * @date 2018/9/12 12:35
 */
@RestController
public class LoginController {
    @RequestMapping(value="index")
    public String login(){
        return "index";
    }
}
