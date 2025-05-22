package com.email_package;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.email_package", "app"})
public class QuickReplyAiApplication {

	public static void main(String[] args) {

		SpringApplication.run(QuickReplyAiApplication.class, args);
	}

}
