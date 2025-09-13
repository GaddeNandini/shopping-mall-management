package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.user.repo.userRepo;

@SpringBootApplication
@ComponentScan("com.example")
public class UserApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
	@Autowired
	private userRepo userRepo;
	
	@Override
	public void run(String... args) throws Exception {
	      /* userdetails u=new userdetails(1,"ramesh","prime","@43d6fgg");
	       userRepo.save(u);
	       userdetails u1=new userdetails(2,"rajesh","Normal","@8fgngg");
	       userRepo.save(u1);
	       userdetails u3=new userdetails(3,"raghu","prime","raghu123");
	       userRepo.save(u3);
	}*/

	}
}
