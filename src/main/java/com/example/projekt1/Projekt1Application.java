package com.example.projekt1;

import com.example.projekt1.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Projekt1Application implements CommandLineRunner {

    private final UserService userService;

    @Autowired
    public Projekt1Application(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Projekt1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

     userService.sortUsersByAge();

     log.info("test aplikacji");
    }
}
