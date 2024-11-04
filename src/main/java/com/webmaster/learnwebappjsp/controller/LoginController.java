package com.webmaster.learnwebappjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/webapp")
@SessionAttributes("username")
public class LoginController {
    @RequestMapping( value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model) {
        return "login";
    }

    @RequestMapping( value = "/login", method = RequestMethod.POST)
    public String welcomePage(@RequestParam String username, @RequestParam String password, ModelMap model) {
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        return "welcome";
    }
}
