package com.webmaster.learnspring.example01;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {
    // @Autowired   - Field Injection
    Dependency1 dependency1;
   
    // @Autowired   - Field Injection
    Dependency2 dependency2;

    
    // @Autowired  // Setter Injection
/*     public void setDependency1(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    } */


    // @Autowired  // Setter Injection
/*     public void setDependency2(Dependency2 dependency2) {
        this.dependency2 = dependency2;
    } */

    // constructor Injection
     public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "YourBusinessClass [dependency1=" + dependency1 + ", dependency2=" + dependency2 + "]";
    }
}
@Component
class Dependency1 {

}
@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class).toString());    
        }
    }
}
