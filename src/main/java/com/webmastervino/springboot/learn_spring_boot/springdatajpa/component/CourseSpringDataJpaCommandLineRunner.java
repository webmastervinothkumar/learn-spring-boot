package com.webmastervino.springboot.learn_spring_boot.springdatajpa.component; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.webmastervino.springboot.learn_spring_boot.jpa.model.Course;
import com.webmastervino.springboot.learn_spring_boot.springdatajpa.repository.CourseSpringDataJpaRepository;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner{

    @Autowired
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(7, "Learn AWS", "In28Minutes", "Learn AWS in 10 minutes"));
        repository.save(new Course(8, "Learn DevOps", "In28Minutes", "Learn DevOps in 10 minutes"));
        repository.save(new Course(9, "Learn Kubernetes", "In28Minutes", "Learn Kubernetes in 10 minutes"));

        repository.deleteById(8l);

        System.out.println(repository.findById(8l));
        //System.out.println(repository.findById(2));
    }

}
