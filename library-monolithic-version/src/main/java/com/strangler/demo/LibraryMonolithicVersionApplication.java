package com.strangler.demo;

import com.strangler.demo.entity.Book;
import com.strangler.demo.entity.Loan;
import com.strangler.demo.entity.User;
import com.strangler.demo.repository.BookRepository;
import com.strangler.demo.repository.LoanRepository;
import com.strangler.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class LibraryMonolithicVersionApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryMonolithicVersionApplication.class, args);
	}

	@Bean
	public CommandLineRunner start(UserRepository userRepository, LoanRepository loanRepository, BookRepository bookRepository) {
		return args -> {
			User user1=userRepository.save(new User(null,"User1"));
			User user2=userRepository.save(new User(null,"User2"));
			User user3=userRepository.save(new User(null,"User3"));

			Book book1=bookRepository.save(new Book(null,"Book1","Author1"));
			Book book2=bookRepository.save(new Book(null,"Book2","Author2"));
			Book book3=bookRepository.save(new Book(null,"Book3","Author3"));

			loanRepository.save(new Loan(null,book1,user1, LocalDate.now(), LocalDate.of(2025,2,23)));
			loanRepository.save(new Loan(null,book2,user1, LocalDate.now(), LocalDate.of(2025,2,23)));
			loanRepository.save(new Loan(null,book2,user2, LocalDate.now(), LocalDate.of(2025,2,23)));
			loanRepository.save(new Loan(null,book3,user3, LocalDate.now(), LocalDate.of(2025,2,23)));

		};
	}

}
