package com.webmaster.learnspring.udemy.springbasics.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContra")
public class SuperContraGame implements GamingConsole {

    @Override
    public void up() {
        // TODO Auto-generated method stub
        System.out.println("Up");
       // throw new UnsupportedOperationException("Unimplemented method 'up'");
    }

    @Override
    public void down() {
        // TODO Auto-generated method stub
        System.out.println("Sit Down");
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
        System.out.println("Shoot a bullet");
       // throw new UnsupportedOperationException("Unimplemented method 'right'");
    }


}
