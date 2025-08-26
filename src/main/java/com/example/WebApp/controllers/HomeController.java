package com.example.WebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
@Controller
public class HomeController {
    @GetMapping
    public @ResponseBody String greeting() {
        return "Hello, World!";
    }
    @GetMapping("/jose")
    public @ResponseBody String greetingJose() {
        return "Olá, José!";
    }

}

