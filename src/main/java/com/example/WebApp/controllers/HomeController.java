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

    @GetMapping("/jose2")
    public @ResponseBody String greetingJose2() {
        return "Olá, José2!";
    }

    @GetMapping("/jose3")
    public @ResponseBody String greetingJose3() {
        return "Olá, José3!";
    }

    @GetMapping("/jose4")
    public @ResponseBody String greetingJose4() {
        return "Olá, José4!";
    }

    @GetMapping("hotfix")
    public @ResponseBody String hotfix() {
        return "hotfix!";
    }

}

