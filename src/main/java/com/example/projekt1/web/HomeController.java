package com.example.projekt1.web;

import com.example.projekt1.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api")
public class HomeController {

    @GetMapping("/test")
    public User testApi(@RequestParam String userName) {

        User user = new User(userName, 18);
        log.info("Test REST API 1");

        return user;
    }

    @PostMapping("/create-user")
    public ResponseEntity<String> createUser(@RequestBody User user) {

        log.info("Nowy user: {}",  user.getName());

        if (user.getName().equals("Jacek")) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok("nowy uzytkownik");
    }

    @GetMapping("/test2")
    public ResponseEntity<String> test2() {

        return ResponseEntity.badRequest().build();
    }
}
