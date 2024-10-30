package com.webmaster.learnspring.udemy.springbasics;

import com.webmaster.learnspring.udemy.springbasics.game.GameRunner;
import com.webmaster.learnspring.udemy.springbasics.game.MarioGame;
import com.webmaster.learnspring.udemy.springbasics.game.PacManGame;
import com.webmaster.learnspring.udemy.springbasics.game.SuperContraGame;

public class AppGamingBasic {

    public static void main(String[] args) {
        var game = new MarioGame();
        var gameRunner = new GameRunner(game);
        gameRunner.play();

        var game2 = new SuperContraGame();
        gameRunner = new GameRunner(game2);
        gameRunner.play();

        var game3 = new PacManGame();
        gameRunner = new GameRunner(game3);
        gameRunner.play();
}

}
