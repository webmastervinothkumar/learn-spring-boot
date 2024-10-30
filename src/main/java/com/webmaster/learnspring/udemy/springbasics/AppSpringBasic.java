package com.webmaster.learnspring.udemy.springbasics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.webmaster.learnspring.udemy.springbasics.configuration.AppSpringBasicConfiguration;
import java.util.Arrays;
public class AppSpringBasic {

    public static void main(String[] args) {

            // Creeate spring annotation configuration context

            var context = new AnnotationConfigApplicationContext(AppSpringBasicConfiguration.class);

            // Get bean
            System.out.println(context.getBean("getGreeting")); 
            System.out.println(context.getBean("getGameName")); 
            System.out.println(context.getBean("name")); 
            System.out.println(context.getBean("age")); 
            System.out.println(context.getBean("person")); 
            System.out.println(context.getBean("address2")); 
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            // Close context
            context.close();

    }
}
