package com.webmastervino.springboot.learn_spring_boot.jpa.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.webmastervino.springboot.learn_spring_boot.jpa.model.Course;
import com.webmastervino.springboot.learn_spring_boot.jpa.repository.CourseJpaRepository;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class CourseJpaCommonLinerRunner implements CommandLineRunner{

    @Autowired
    private CourseJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(4, "Learn AWS", "In28Minutes", "Learn AWS in 10 minutes"));
        repository.save(new Course(5, "Learn DevOps", "In28Minutes", "Learn DevOps in 10 minutes"));
        repository.save(new Course(6, "Learn Kubernetes", "In28Minutes", "Learn Kubernetes in 10 minutes"));

        repository.deleteById(5);

        System.out.println(repository.findById(4));
        //System.out.println(repository.findById(2));
    }

}
