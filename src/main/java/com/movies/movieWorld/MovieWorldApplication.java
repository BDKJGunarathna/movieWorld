package com.movies.movieWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MovieWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieWorldApplication.class, args);
	}

	@GetMapping("/")
	public String apiRoot(){
		return "Hello Apis";
	}

}
