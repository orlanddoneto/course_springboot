package com.devOrlando.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devOrlando.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User("name",90L,"email@email.com","999999","senha");
		return ResponseEntity.ok().body(u);
	}

}
