package com.lalit.security.jwtsecurity;

import com.lalit.security.jwtsecurity.entity.User;
import com.lalit.security.jwtsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class JwtSecurityApplication {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(JwtSecurityApplication.class, args);
	}

	@PostConstruct
	public void initUsers(){
		List<User> users = Stream.of(
				new User(101, "lalit", "password", "abc@a.com"),
				new User(102, "user", "password", "abc@a.com")
		).collect(Collectors.toList());

		userRepository.saveAll(users);
	}

}
