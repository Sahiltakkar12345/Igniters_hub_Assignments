package com.service;

import org.springframework.stereotype.Service;

import com.entity.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user list

    List<User> list = List.of(
            new User(1311L, "Parmod Kumar", "9585658745"),
            new User(1312L, "Ankit Yadav", "9597454575"),
            new User(1314L, "Ravi chauhan", "9034124545")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}