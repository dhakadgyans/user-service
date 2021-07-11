package com.gyandevtools.userservices.controller;

import com.gyandevtools.userservices.entity.Contact;
import com.gyandevtools.userservices.entity.User;
import com.gyandevtools.userservices.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{UserId}")
    public User getData(@PathVariable("UserId") Long UserId){
      List<Contact> l=  restTemplate.getForObject("http://CONTACT-SERVICE/contact/"+UserId, List.class);
        User user=  this.userService.getUser(UserId);
        user.setContacts(l);
        return user;
    }

}
