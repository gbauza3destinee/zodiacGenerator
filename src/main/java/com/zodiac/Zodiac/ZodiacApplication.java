package com.zodiac.Zodiac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// tie jpa repo to program
@EnableJpaRepositories(basePackages="com.zodiac.Zodiac.Repository")

@SpringBootApplication
public class ZodiacApplication {

	public static void main(String[] args) {
		System.out.println("Hello, Running Docker container!");
		SpringApplication.run(ZodiacApplication.class, args);
	}

}
