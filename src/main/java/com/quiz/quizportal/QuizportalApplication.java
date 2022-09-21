package com.quiz.quizportal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.quiz.quizportal.helper.UserFoundException;
import com.quiz.quizportal.model.Role;
import com.quiz.quizportal.model.User;
import com.quiz.quizportal.model.UserRole;
import com.quiz.quizportal.repository.QuizRepository;
import com.quiz.quizportal.service.UserService;

@EnableAutoConfiguration
@SpringBootApplication
public class QuizportalApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	public QuizRepository quizRepository;

	public static void main(String[] args) {
		SpringApplication.run(QuizportalApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
        try {


            System.out.println("starting code");
//
            User user = new User();

            user.setFirstName("Moiz");
            user.setLastName("S");
            user.setUsername("ms123");
            user.setPassword(this.bCryptPasswordEncoder.encode("password"));
            user.setEmail("ms@gmail.com");
            user.setProfile("default.png");

            Role role1 = new Role();
            role1.setRoleId(44L);
            role1.setRoleName("ADMIN");

            Set<UserRole> userRoleSet = new HashSet<>();
            UserRole userRole = new UserRole();

            userRole.setRole(role1);

            userRole.setUser(user);

            userRoleSet.add(userRole);

            User user1 = this.userService.createUser(user, userRoleSet);
            System.out.println(user1.getUsername());


        } catch (UserFoundException e) {
            e.printStackTrace();


        }


    }


}
