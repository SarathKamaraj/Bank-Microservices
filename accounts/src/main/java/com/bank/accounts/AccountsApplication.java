package com.bank.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountsApplication {

	/**
	 * This is the main entry point for the Spring Boot application. It is
	 * used to launch the application.
	 *
	 * @param args The command line arguments passed to the application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}
}
