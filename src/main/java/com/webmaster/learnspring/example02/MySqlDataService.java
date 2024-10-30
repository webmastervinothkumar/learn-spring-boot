package com.webmaster.learnspring.example02;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService {

    @Override
    public int[] getData() {
        return new int[] { 6,7,8,9,10 };
    }

}
