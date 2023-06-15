package ru.maxima.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    // Аннотация служит для того, чтобы рутировать запрос
    @GetMapping("/hello")
    public String hello() {
        // вернет нам представление, которое наодится в папке webapp/WEB-INF/views/
        return "hello_world";
    }
}
