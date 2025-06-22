package com.tcs.FirstProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tcs.FirstProject.jpa.UserRepository;
import com.tcs.FirstProject.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	
	@PostMapping()
    public ResponseEntity<String> createUser(@RequestBody User user) {
       
		userRepository.save(user);
		return ResponseEntity.ok("User created successfully");
    }

    @GetMapping()
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<User> getAllUsers(@PathVariable Long id) {
        return userRepository.findById(id);
    }

}
