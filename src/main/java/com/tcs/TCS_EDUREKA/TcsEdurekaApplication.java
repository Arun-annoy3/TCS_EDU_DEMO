package com.tcs.TCS_EDUREKA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
