package com.bach.curso.springboot.app.springboot_web.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bach.curso.springboot.app.springboot_web.models.User;
import com.bach.curso.springboot.app.springboot_web.models.dto.UserDto;



@RestController
@RequestMapping("/api")
public class UserRestController {


     @GetMapping("/details")
    public UserDto details(){
        
        UserDto userDto = new UserDto();
        User user = new User("bye", "Bach");
        userDto.setUser(user);
        userDto.setTitle("Hola Spring Framework con Model");

        return userDto;
    }
    @GetMapping("/list")
    public List<User> list(){
        User user = new User("El pepe", "Argento");
        User user2 = new User("bye", "Bach");
        User user3 = new User("fulanito", "Frog");

        List<User> users = Arrays.asList(user, user2, user3);

        //List<User> users = new ArrayList<>();
        //users.add(user);
        //users.add(user2);
        //users.add(user3);

        return users;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){
        
        User user = new User("bye", "Bach");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Spring Framework con Model");
        body.put("user", user);
        return body;
    }
    
}
