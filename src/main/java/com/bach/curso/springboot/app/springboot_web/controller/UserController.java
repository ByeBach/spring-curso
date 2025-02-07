package com.bach.curso.springboot.app.springboot_web.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.bach.curso.springboot.app.springboot_web.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("bye", "Bach");
        user.setEmail("byebach@gmail.com");
        model.addAttribute("title", "Hola Spring Framework con Model");
        model.addAttribute("user", user);
        return "details";
    }
    @GetMapping("/list")
    public String list(ModelMap model){
        
        // List<User> users = Arrays.asList(
        //     new User("bye", "bach", "byebachgm@gmail.com"),
        //     new User("el", "pepe", "elpepe@gmail.com"),
        //     new User("cosme", "fulanito"));

        // model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }
    //para reutilizar datos en varias vistas
    @ModelAttribute("users")
    public List<User> usersModel(){
        return Arrays.asList(
            new User("bye", "bach", "byebachgm@gmail.com"),
            new User("el", "pepe", "elpepe@gmail.com"),
            new User("cosme", "fulanito")); 
    }
    @GetMapping("/testTemplate")
    public String templatesTest(Model model) {
        model.addAttribute("title", "Hola Spring Framework con Thymeleaf");
        return "test";
    }
    


}
