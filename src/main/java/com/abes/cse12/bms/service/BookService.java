package com.abes.cse12.bms.service;

import com.abes.cse12.bms.entity.Books;
import com.abes.cse12.bms.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String addBook(Books book) {
        bookRepository.save(book);
        return "Book added successfully!";
    }

    public List<Books> getAllBooks() {
        return bookRepository.findAll();
    }

    public Books getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
}

