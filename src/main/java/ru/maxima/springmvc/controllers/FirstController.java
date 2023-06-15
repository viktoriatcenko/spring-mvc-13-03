package ru.maxima.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    // localhost:8080/hello
    @GetMapping("/hello")
    public String hello() {
        return "hello_world";
    }
}
