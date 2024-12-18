package com.project.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
	public class BlogApplication {
		public static void main(String[] args) {
			SpringApplication.run(BlogApplication.class, args);
		}

	}

}
