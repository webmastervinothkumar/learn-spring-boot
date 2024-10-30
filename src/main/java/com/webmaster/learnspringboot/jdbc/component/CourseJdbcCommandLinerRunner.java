package com.webmaster.learnspringboot.jdbc.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.webmaster.learnspringboot.jdbc.model.Course;
import com.webmaster.learnspringboot.jdbc.repository.CourseJdbcRepository;

@Component
public class CourseJdbcCommandLinerRunner implements CommandLineRunner{

    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS", "In28Minutes", "Learn AWS in 10 minutes"));
        repository.save(new Course(2, "Learn DevOps", "In28Minutes", "Learn DevOps in 10 minutes"));
        repository.save(new Course(3, "Learn Kubernetes", "In28Minutes", "Learn Kubernetes in 10 minutes"));

        repository.deleteById(2);

        System.out.println(repository.findById(1));
        //System.out.println(repository.findById(2));
    }

}
