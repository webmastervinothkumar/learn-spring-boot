package com.webmaster.learnspring.udemy.springbasics.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole game;
    //SuperContraGame superContraGame;

    public GameRunner(@Qualifier("pacman") GamingConsole game) {  
        this.game = game;
    }
    /* public GameRunner(SuperContraGame superContraGame) {
        this.superContraGame = superContraGame;
    } */
    public void play() {
        System.out.println("Playing Game" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
