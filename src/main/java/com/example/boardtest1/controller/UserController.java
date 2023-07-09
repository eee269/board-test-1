package com.example.boardtest1.controller;

import com.example.boardtest1.dto.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @PostMapping("/sign-up")
    public void SignUpUser(@RequestBody UserDto userDto)
    {

    }
}
