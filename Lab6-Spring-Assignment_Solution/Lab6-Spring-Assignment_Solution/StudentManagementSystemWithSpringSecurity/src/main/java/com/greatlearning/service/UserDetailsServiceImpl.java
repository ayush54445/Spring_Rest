package com.greatlearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.greatlearning.dao.UserRepository;
import com.greatlearning.entity.User;
import com.greatlearning.security.MyUserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	 @Override
	    public UserDetails loadUserByUsername(String username)
	            {
	    	
	        User user = userRepository.getUserByUsername(username);
	         System.out.println(user);
	        if (user == null) {
	            throw new UsernameNotFoundException("Could not find user");
	        }
	         
	        return new MyUserDetails(user);
	    }
}
