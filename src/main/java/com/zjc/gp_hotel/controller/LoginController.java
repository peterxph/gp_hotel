package com.zjc.gp_hotel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/login")
    public String login(@RequestParam("userName") String userName,@RequestParam("userPassword") String userPassword){
        System.out.println(userName+" "+userPassword);
        return null;
    }
}
