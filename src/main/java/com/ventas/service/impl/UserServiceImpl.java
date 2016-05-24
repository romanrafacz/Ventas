package com.ventas.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventas.domain.User;
import com.ventas.repository.UserRepository;
import com.ventas.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@PersistenceContext EntityManager entityManager;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository){
		this.userRepository = userRepository;
	}

	@Override
	public User addUser(User newUser) {
		// TODO Auto-generated method stub
		LOGGER.debug("entering a user");
		User user = new User();
		user.setUsername(newUser.getUsername());
		user.setEmail(newUser.getEmail());
		user.setAddress(newUser.getAddress());
		user.setCity(newUser.getCity());
		user.setPhone(newUser.getPhone());
		user.setPostalCode(newUser.getPostalCode());
		user.setState(newUser.getState());
		userRepository.save(user);
		return null;
	}

}
