package com.webmaster.learnspring.udemy.springbasics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.webmaster.learnspring.udemy.springbasics.configuration.AppGamingConfiguration;
import com.webmaster.learnspring.udemy.springbasics.game.GameRunner;
import com.webmaster.learnspring.udemy.springbasics.game.GamingConsole;
import com.webmaster.learnspring.udemy.springbasics.game.MarioGame;
import com.webmaster.learnspring.udemy.springbasics.game.PacManGame;
import com.webmaster.learnspring.udemy.springbasics.game.SuperContraGame;

public class AppGamingSpringBeans {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(AppGamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).play();
        }
    }

}
