package com.example.projekt1;

import com.example.projekt1.model.User2;
import com.example.projekt1.service.DateGenerator;
import com.example.projekt1.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Projekt1Application {

//    private final UserService userService;
//    private final DateGenerator dateGenerator;

//    @Autowired
//    public Projekt1Application(UserService userService, DateGenerator dateGenerator) {
//        this.userService = userService;
//        this.dateGenerator = dateGenerator;
//    }

    public static void main(String[] args) {
        SpringApplication.run(Projekt1Application.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//
////     userService.sortUsersByAge();
//
//
////        User2 user2 = userService.createUser2();
////
////        log.info("user2 name {}", user2.getName() );
////
////        user2.setName("Gniewomir");
////
////        log.info("user2 name {}", user2.getName() );
////        log.info("test aplikacji");
//
//        dateGenerator.generateDate(3, 2024, 5);
//
//    }
}
