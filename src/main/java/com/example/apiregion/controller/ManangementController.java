package com.example.apiregion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("manangement")

public class ManangementController {
    @GetMapping("index")
    public String index() {return "management/index";}
}
