package com.webmaster.learnspring.example04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


// eager loading by default
@Component
class ClassA {
    private ClassB classB;
    @Lazy
    public ClassA(ClassB classB) {
        System.out.println("ClassA initiated");
        this.classB = classB;
    }
}

// lazy loading
@Component
class ClassB {
    private ClassA classA;
    @Lazy
    public ClassB(ClassA classA) {
        System.out.println("ClassB initiated");
        this.classA = classA;
    }
}
@Configuration
@ComponentScan
public class CircularReferenceLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(CircularReferenceLauncherApplication.class)) {
            context.getBean(ClassA.class);
            context.getBean(ClassB.class);
        }
    }
}
