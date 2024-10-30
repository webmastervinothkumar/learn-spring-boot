package com.webmaster.learnspring.udemy.springbasics.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.webmaster.learnspring.udemy.springbasics.game.GameRunner;
import com.webmaster.learnspring.udemy.springbasics.game.GamingConsole;
import com.webmaster.learnspring.udemy.springbasics.game.MarioGame;
import com.webmaster.learnspring.udemy.springbasics.game.PacManGame;
import com.webmaster.learnspring.udemy.springbasics.game.SuperContraGame;

@Configuration
public class AppGamingConfiguration {

    @Bean
    public GamingConsole marioGame() {
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole marioGame) {
        return new GameRunner(marioGame);
    }
}
