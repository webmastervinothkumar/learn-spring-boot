package com.webmaster.learnwebappjsp.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class WelcomeController {
    @RequestMapping( value = "/", method = RequestMethod.GET)
    public String gotoWelcomePage(ModelMap model) {
        model.addAttribute("username", getAuthenticatedUserName());
        return "welcome";
    }

    private String getAuthenticatedUserName() {
        Authentication authentication = (Authentication) SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
}
