package com.moss.controller;

import com.moss.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    @RequestMapping("/user")
    public User getUser(){
        User user = new User("shenpeng", 18);
        return user;
    }

}
