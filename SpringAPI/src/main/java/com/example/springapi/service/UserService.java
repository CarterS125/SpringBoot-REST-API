package com.example.springapi.service;

import com.example.springapi.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Carter", 23, "carter@mail.com");
        User user2 = new User(2, "Niemiah", 26, "niemiah@mail.com");
        User user3 = new User(3, "Lucas", 22, "lucas@mail.com");
        User user4 = new User(4, "Luke", 26, "luke@mail.com");
        User user5 = new User(5, "Daniel", 25, "daniel@mail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(Integer id){
        Optional<User> optional = Optional.empty();
        for (User user: userList) {
            if(id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }

        }
        return optional;
    }
}
