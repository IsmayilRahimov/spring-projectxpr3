package org.example.springprojectxpr3.controller;

import org.example.springprojectxpr3.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class ProjectController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/save")
    public String save() {
        return "Data Saved!";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "Data Deleted!";
    }

//    @GetMapping("/message/{m} ")
//    public String getMyMessage(@PathVariable("m") String message) {
//        return "Hola mundo!" + message;
//    }

    @GetMapping("/message")
    public String getMyMessage(@RequestParam String message) {
        return "Your message!" + message;
    }

    @PostMapping("/saveuser")

    public User saveUser(@RequestBody User user) {
        System.out.println("User saved");
        user.setPassword(" - ");
        return user;
    }

    @PostMapping("/saveall")
    public List<User> saveUsers(@RequestBody List<User> users) {
        users.forEach(user -> user.setPassword(" - "));
        return users;
    }

    @GetMapping("/header")

    public String getHeader(@RequestHeader("My-Header") String headers) {
        return "My Headers :" + headers;
    }

//    public String getHeader(@RequestHeader("Authorization") String token) {
//        return token;
//    }

}
