package com.ard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginContrioller {

    @RequestMapping("loginPage")
    public String login() {
        System.out.println("登陆成功！");
        return "index";
    }
}
