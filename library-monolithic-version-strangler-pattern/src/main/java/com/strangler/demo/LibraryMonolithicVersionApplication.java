package com.strangler.demo;

import com.strangler.demo.entity.Loan;
import com.strangler.demo.facade.UserFacade;
import com.strangler.demo.model.User;
import com.strangler.demo.repository.LoanRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@SpringBootApplication
public class LibraryMonolithicVersionApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryMonolithicVersionApplication.class, args);
	}



	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
