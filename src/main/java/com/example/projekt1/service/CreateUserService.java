package com.example.projekt1.service;

import com.example.projekt1.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CreateUserService {

    private User create(String name, Integer age) {
        User user = new User(name, age);

        user.setColor("red");

        log.info("Helllo new user {} {}", user.getName(), user.getAge());
        return user;
    }

//    private User createVip() {
//        User user = new User(name, age);
//
//
//        user.setColor("red");
//
//        log.info("Helllo new user {} {}", user.getName(), user.getAge());
//        return user;
//    }
}
