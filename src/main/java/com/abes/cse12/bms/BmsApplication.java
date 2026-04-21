package com.abes.cse12.bms;

import com.abes.cse12.bms.entity.Books;
import com.abes.cse12.bms.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BmsApplication implements CommandLineRunner {

    public BmsApplication(BookRepository bookRepository) {
        this.repo = bookRepository;
		System.out.println("Application started");
    }

    public static void main(String[] args) {
		SpringApplication.run(BmsApplication.class, args);
	}
	private final BookRepository repo;
	@Override
	public void run(String... args) throws Exception {

		repo.save(new Books(null,"Let us C",255,310));
		repo.save(new Books(null,"Let us C++",355,320));
		repo.save(new Books(null,"Let us java",455,330));
		repo.save(new Books(null,"Let us Springboot",485,370));
	}
}
