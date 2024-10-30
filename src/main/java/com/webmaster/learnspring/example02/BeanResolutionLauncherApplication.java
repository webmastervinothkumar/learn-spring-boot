package com.webmaster.learnspring.example02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class BeanResolutionLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BeanResolutionLauncherApplication.class)) {
            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessCalculationService.class).calculateMax());
        }
    }
}
