package com.ceramicsheaven.controllers;

import com.ceramicsheaven.exceptions.UserException;
import com.ceramicsheaven.model.User;
import com.ceramicsheaven.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/profile")
	public ResponseEntity<User> getUserProfileHandler(@RequestHeader("Authorization") String jwt)throws UserException {
		User user = userService.findUserProfileByJwt(jwt);
		return new ResponseEntity<User>(user,HttpStatus.ACCEPTED);
	}

	@PutMapping("/profile/update")
	public ResponseEntity<User> updateUserProfileHandler(@RequestHeader("Authorization") String jwt ,@RequestBody User user)throws UserException {
		User updateUser = userService.updateUser(jwt,user);
		return new ResponseEntity<User>(user,HttpStatus.ACCEPTED);
	}
}
