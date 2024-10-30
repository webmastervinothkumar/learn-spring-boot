package com.webmaster.learnspring.example07;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
class Dependency1 {
    private Dependency2 dependency2;

    @Inject
    public void setDependency2(Dependency2 dependency2) {
        this.dependency2 = dependency2;
        System.out.println("Dependency2 injected");
    }


}
@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class JakartaCdiLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(JakartaCdiLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);   
        }
    }
}
