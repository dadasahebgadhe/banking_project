package com.javatodev.finance.controller;

import com.javatodev.finance.model.entity.User;
import com.javatodev.finance.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    @Slf4j
    @RestController
    //  @RequiredArgsConstructor
    public class UserController {
        @Autowired
        private UserService userService;

        @PostMapping("/addUser")
        public User addUser(@RequestBody User user) {
            return userService.saveUser(user);
        }

        @PostMapping("/addUsers")
        public List<User> addUsers(@RequestBody List<User> users) {

            return userService.saveUsers(users);
        }

        @GetMapping("/user/{id}")
        public User getUser(@PathVariable Long id) {

            return userService.getUserById(id); // redirecting to home page /
        }

        @GetMapping("/users")
        public List<User> getUsers(){
            return userService.getUsers();
        }

        @PutMapping("/updateUser/{id}")
        public User updateUser(@RequestBody User user) {
           return userService.updateUser(user);
          }

          @DeleteMapping ("user/{id}")
        public String removeUser(@PathVariable Long id){
            return userService.deleteById(id);
          }

    }