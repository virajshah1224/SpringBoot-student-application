package com.example.student;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {


	public static void main(String[] args) {
		//SpringApplication.run(StudentApplication.class, args);
		SpringApplication application = new SpringApplication(StudentApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
	}	
}
