package com.webmaster.learnspring.example05;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Spring Singleton by default
@Component
class ClassA {
   
}

// Spring Prototype
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class ClassB {
}
@Configuration
@ComponentScan
public class BeanScopeLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class)) {
            System.out.println(context.getBean(ClassA.class));
            System.out.println(context.getBean(ClassA.class));
            System.out.println(context.getBean(ClassB.class));
            System.out.println(context.getBean(ClassB.class));
        }
    }
}
