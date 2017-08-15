package org.spring.boot.SpringBootDemo.controller;

import org.spring.boot.SpringBootDemo.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/{id}")
    public User view(@PathVariable("id")
    Long id) {
        User user = new User();
        user.setId(id);
        user.setName("qinbb");

        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserController.class);
    }
}