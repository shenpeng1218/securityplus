package com.moss.controller;

import com.moss.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    @RequestMapping("/user")
    public UserDetails getUser(@AuthenticationPrincipal UserDetails user){
        //User user = new User("shenpeng", 18);
        return user;
    }

}
