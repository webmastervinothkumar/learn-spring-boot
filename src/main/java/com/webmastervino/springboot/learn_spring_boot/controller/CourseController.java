package com.webmastervino.springboot.learn_spring_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;  

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(new Course(1, "Spring Boot", "CodeEvo"), new Course(2,"Spring MVC","code"));
    }
}