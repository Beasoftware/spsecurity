package com.dev.neo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.neo.model.User;
import com.dev.neo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRegistrationController {
	@Autowired
	UserService service;

	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return service.saveData(user);
	}
	@GetMapping("/users")
	public List<User> list() {
		return service.listAll();
	}
	@GetMapping("/search")
	public ResponseEntity<List<User>> searchUsers(@RequestParam("query") String query) {
		return ResponseEntity.ok(UserService.searchUsers(query));
	}

	
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}// end class
