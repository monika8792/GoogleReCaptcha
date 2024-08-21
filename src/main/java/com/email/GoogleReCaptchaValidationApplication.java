package com.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoogleReCaptchaValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleReCaptchaValidationApplication.class, args);
		System.out.println("captchSuccessfully");
	}

}
