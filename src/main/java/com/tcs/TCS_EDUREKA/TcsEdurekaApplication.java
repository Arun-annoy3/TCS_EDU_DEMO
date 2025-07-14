package com.tcs.TCS_EDUREKA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TcsEdurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcsEdurekaApplication.class, args);
	}

	@RestController
	class GreetingController {

		@GetMapping("/greeting")
		public String greeting() {
			return "Hello from TCS Edu Demo!";
		}
	}
}
