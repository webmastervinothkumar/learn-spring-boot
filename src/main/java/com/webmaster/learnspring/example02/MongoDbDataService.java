package com.webmaster.learnspring.example02;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {

    @Override
    public int[] getData() {
        return new int[] { 1, 2, 3, 4, 5 };
    }

}
