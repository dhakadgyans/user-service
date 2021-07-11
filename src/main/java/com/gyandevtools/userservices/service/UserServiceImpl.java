package com.gyandevtools.userservices.service;

import com.gyandevtools.userservices.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> ls = List.of(
            new User(123L,"Gyan","Pune"),
            new User(124L,"Aloo","Indore"),
            new User(125L,"Demo","Bhopal")

    );

    @Override
    public User getUser(Long UserId) {
        return ls.stream().filter(e -> e.getUserId().equals(UserId)).findAny().orElse(null);
    }

}
