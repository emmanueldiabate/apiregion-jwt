package com.example.apiregion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Admin")


public class AdminController {
    @GetMapping("index")
    public String index(){ return "admin/index";}
}
