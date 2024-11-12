package com.webmaster.learnrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webmaster.learnrestapi.model.HelloWorldBean;

@RestController
public class HelloWorld {

    //@RequestMapping(method = {org.springframework.web.bind.annotation.RequestMethod.GET}, path = "/helloworld")
    @GetMapping("/hello-world")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean sayHelloBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world-bean/{name}")
    public HelloWorldBean sayHelloBeanPathVariable(@PathVariable String name) {
        String message = String.format("Hello World, %s", name);
        return new HelloWorldBean(message);
    }
}
