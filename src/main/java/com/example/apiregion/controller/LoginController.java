package com.example.apiregion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.ScheduledFuture;

@Controller
@RequestMapping("/")

public class LoginController {
    @GetMapping("index")
    public String index(){ return "index";}
    @GetMapping("login")
    public String login() {return "login";}
}
