package ru.maxima.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/people")
public class HelloController {

    // Аннотация служит для того, чтобы рутировать запрос
    // Create - @PostMapping
    // Read - @GetMapping
    // Update - @PutMapping/@PatchMapping
    // Delete  - @DeleteMapping
//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping("/hello")
    public String hello() {
        // вернет нам представление, которое наодится в папке webapp/WEB-INF/views/
        return "hello_world";
    }

    @PostMapping("/hello")
    public String goodbye() {
        // вернет нам представление, которое наодится в папке webapp/WEB-INF/views/
        return "hello_world";
    }

    @DeleteMapping("/delete")
    public String delete() {
        // вернет нам представление, которое наодится в папке webapp/WEB-INF/views/
        return "hello_world";
    }
}
