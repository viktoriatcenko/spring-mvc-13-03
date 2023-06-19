package ru.maxima.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(
            // Ожидаю, что мне в параметр придет ключ name
            @RequestParam(value = "name", required = false)
            // кладу его значение в переменную nameFromParameter
            String nameFromParameter,
            @RequestParam(value = "job", required = false) String jobFromParameter,
            Model model) {
        model.addAttribute("nameFromModel", "Hello, " + nameFromParameter + "!");
        model.addAttribute("jobFromModel", "Your job is " + jobFromParameter);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
}
