package com.example.projekt1.service;

import com.example.projekt1.model.User;
import com.example.projekt1.model.User2;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
@Slf4j
public class UserService {

    private  final DateGenerator dateGenerator;
    private final CreateUserService createUserService;

    @Autowired
    public UserService(DateGenerator dateGenerator, CreateUserService createUserService) {
        this.dateGenerator = dateGenerator;
        this.createUserService = createUserService;
    }

    public void sortUsersByAge() {
        List<User> userList = createUserList();

        List<User> collect = userList.stream()
                .sorted(Comparator.comparing(User::getAge))
                .toList();

        collect.forEach(user -> log.info("user name: {} , age: {}", user.getName(), user.getAge()));
    }

    public List<User> createUserList() {
        ArrayList<User> users = new ArrayList<>();

        users.add(createUser("Jacek", 20));
        users.add(createUser("Jacek2", 270));
        users.add(createUser("Jacek3", 2));
        users.add(createUser("Jacek4", 20));
        users.add(createUser("Jacek5", 208));

        return users;
    }

    private User createUser(String name, Integer age) {
        User user = new User(name, age);
        user.setColor("red");

        log.info("Helllo new user {} {}", user.getName(), user.getAge());
        return user;
    }

    public Integer getUserAge(User user) {

        return user.getAge();
    }

    public User2 createUser2() {
        User2 user2 = new User2();

        return  user2;
    }
}