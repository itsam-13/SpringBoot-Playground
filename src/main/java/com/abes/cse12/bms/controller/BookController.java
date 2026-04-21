package com.abes.cse12.bms.controller;

import com.abes.cse12.bms.entity.Books;
import com.abes.cse12.bms.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public String addBook(@RequestBody Books book) {
        return bookService.addBook(book);
    }

    @GetMapping
    public List<Books> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Books getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PutMapping("/{id}")
    public String updateBookById() {
        return "update book";
    }

    @DeleteMapping("/{id}")
    public String deleteBookById() {
        return "delete book";
    }
}
