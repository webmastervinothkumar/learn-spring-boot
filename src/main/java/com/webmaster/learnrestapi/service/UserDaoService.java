package com.webmaster.learnrestapi.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.webmaster.learnrestapi.model.User;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static long idCounter = 0;

    static {
        users.add(new User(++idCounter, "John", LocalDate.now().minusYears(30)));
        users.add(new User(++idCounter, "Adam", LocalDate.now().minusYears(20)));
        users.add(new User(++idCounter, "Vino", LocalDate.of(1970, 1, 1)));
        users.add(new User(++idCounter, "HellBoy", LocalDate.of(1980, 1, 1)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(long id) {
        Predicate <User> userPredicate = user -> user.getId().equals(id);
        return users.stream().filter(userPredicate).findFirst().orElse(null);
    }

    public User createUser(User user) {
        user.setId(++idCounter);
        users.add(user);
        return user;
    }
}
