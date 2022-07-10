package com.greatlearning;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.greatlearning.dao.RoleRepository;
import com.greatlearning.dao.UserRepository;
import com.greatlearning.entity.Role;
import com.greatlearning.entity.User;

@SpringBootApplication
public class StudentManagementSystemWithSpringSecurityApplication implements CommandLineRunner  {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemWithSpringSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Welcome to Student Manager!");
//		PasswordEncoder encoder = new BCryptPasswordEncoder();
//		Role role1 = new Role();
//		role1.setName("GUEST");
//		User user1 = new User();
//		user1.setUsername("sandy");
//		user1.setPassword(encoder.encode("sandy"));
//		List<Role> user1_roles = new ArrayList<Role>();
//		user1_roles.add(role1);
//		user1.setRoles(user1_roles);
//		userRepository.save(user1);
//		roleRepository.save(role1);
		
		
	}

}
