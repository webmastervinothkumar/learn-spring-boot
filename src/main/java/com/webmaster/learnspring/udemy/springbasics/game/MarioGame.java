package com.webmaster.learnspring.udemy.springbasics.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

    @Override
    public void up() {
        // TODO Auto-generated method stub
        System.out.println("Jump");
       // throw new UnsupportedOperationException("Unimplemented method 'up'");
    }
    @Override
    public void down() {
        // TODO Auto-generated method stub
        System.out.println("Go into a hole");
       // throw new UnsupportedOperationException("Unimplemented method 'down'");
    }
    @Override
    public void left() {
        // TODO Auto-generated method stub
        System.out.println("Go back");
       // throw new UnsupportedOperationException("Unimplemented method 'left'");
    }
    @Override
    public void right() {
        // TODO Auto-generated method stub
        System.out.println("Accelerate");
       // throw new UnsupportedOperationException("Unimplemented method 'right'");
    }

}
