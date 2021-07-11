package com.gyandevtools.userservices.service;

import com.gyandevtools.userservices.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public User getUser(Long UserId);
}
