package com.webmaster.learnwebappjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/webapp")
public class LoginController {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
