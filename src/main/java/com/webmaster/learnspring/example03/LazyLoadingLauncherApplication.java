package com.webmaster.learnspring.example03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


// eager loading by default
@Component
class ClassA {

}

// lazy loading
@Component
@Lazy
class ClassB {
    private ClassA classA;
    public ClassB(ClassA classA) {
        System.out.println("ClassB initiated");
        this.classA = classA;
    }
}
@Configuration
@ComponentScan
public class LazyLoadingLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LazyLoadingLauncherApplication.class)) {
            context.getBean(ClassA.class);
            context.getBean(ClassB.class);
        }
    }
}
