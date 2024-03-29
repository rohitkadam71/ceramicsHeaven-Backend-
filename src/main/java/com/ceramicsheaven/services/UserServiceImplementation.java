package com.ceramicsheaven.services;


import com.ceramicsheaven.config.JwtProvider;
import com.ceramicsheaven.exceptions.UserException;
import com.ceramicsheaven.model.User;
import com.ceramicsheaven.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServiceImplementation implements UserService{
	
	private UserRepository userRepository;
	private JwtProvider jwtProvider;
	
	@Autowired
	public UserServiceImplementation(UserRepository userRepository, JwtProvider jwtProvider) {
		this.userRepository = userRepository;
		this.jwtProvider = jwtProvider;
	}

	@Override
	public User findById(Long userId) throws UserException {
		Optional<User> user = userRepository.findById(userId);
		
		if (user.isPresent()) {
			return user.get();
		}
		throw new UserException("User Not Found With Id -"+userId);
	}

	@Override
	public User findUserProfileByJwt(String jwt) throws UserException {
		String email = jwtProvider.getEmailFromToken(jwt);
		
		User user = userRepository.findByEmail(email);
		
		if (user == null) {
			throw new UserException("User Not Found With This Exceptio"+email);
		}
		System.out.println("Found User : "+user.toString());
		return user;
	}

	@Override
	public User updateUser(String jwt, User user) throws UserException {
		String email = jwtProvider.getEmailFromToken(jwt);
		User existingUser = userRepository.findByEmail(email);

		if(existingUser == null){
			throw new UserException("User Not Found");
		}

		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName((user.getLastName()));
		existingUser.setMobile(user.getMobile());
		existingUser.setGender(user.getGender());
		return userRepository.save(existingUser);
	}

}
