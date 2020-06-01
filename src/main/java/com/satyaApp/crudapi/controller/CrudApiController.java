package com.satyaApp.crudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satyaApp.crudapi.entity.User;
import com.satyaApp.crudapi.service.CrudApiService;

@RestController
@RequestMapping("/crud")
public class CrudApiController {
	
	@Autowired
	private CrudApiService crudApiService;
	
	@GetMapping("/users")
	public List<User> retriveAllUsers() {
		return crudApiService.retriveAllUsers();
	}
	
	@PostMapping("/user")
	public User createUser(@RequestBody final User user) {
		return crudApiService.createUser(user);
	}
	
	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable final long id,@RequestBody final User user) {
		return crudApiService.updateUser(id,user);
	}
	
	@DeleteMapping("/user/{id}")
	public void removeUser(@PathVariable final long id) {
		crudApiService.removeUser(id);
	}
}
