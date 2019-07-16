package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@SpringBootApplication
public class HelloworldApplication {


	public static void main(String[] args) {

		SpringApplication.run(HelloworldApplication.class, args);
	}

	@GetMapping("/helloworld")
	public String helloWorld(){
		return "hello World";
	}

}
