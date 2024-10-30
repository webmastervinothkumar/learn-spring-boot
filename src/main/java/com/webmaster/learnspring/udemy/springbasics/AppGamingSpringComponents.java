package com.webmaster.learnspring.udemy.springbasics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.webmaster.learnspring.udemy.springbasics.configuration.AppGamingConfiguration;
import com.webmaster.learnspring.udemy.springbasics.game.GameRunner;
import com.webmaster.learnspring.udemy.springbasics.game.GamingConsole;

@Configuration
@ComponentScan("com.webmaster.learnspring.udemy.springbasics.game")
public class AppGamingSpringComponents {

     public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(AppGamingSpringComponents.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).play();
        }
    }
}
