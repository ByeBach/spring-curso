package com.bach.curso.springboot.app.springboot_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bach.curso.springboot.app.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("bye", "Bach");
        model.addAttribute("title", "Hola Spring Framework con Model");
        model.addAttribute("user", user);
        return "details";
    }

}
