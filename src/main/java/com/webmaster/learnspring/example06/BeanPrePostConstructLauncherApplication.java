package com.webmaster.learnspring.example06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class ClassA {
   private ClassB classB;

    public ClassA(ClassB classB) {
        this.classB = classB;
        System.out.println("ClassA initiated");
    }

    @PostConstruct
    public void initialize() {
        System.out.println("ClassA Postconstruct executed");
    }

    @PreDestroy
    public void tearDown() {
        System.out.println("ClassA teardown executed");
    }

    public void doSomething() {
        System.out.println("ClassA doSomething executed");
    }
}

@Component
class ClassB {
}
@Configuration
@ComponentScan
public class BeanPrePostConstructLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BeanPrePostConstructLauncherApplication.class)) {
            context.getBean(ClassA.class).doSomething();
        }
    }
}
