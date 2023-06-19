package ru.maxima.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThirdController {


    @GetMapping("/thirdHello")
    public String hello(Model model) {
        model.addAttribute("superHero", "Batman");
        return "first/hello";
    }
}
