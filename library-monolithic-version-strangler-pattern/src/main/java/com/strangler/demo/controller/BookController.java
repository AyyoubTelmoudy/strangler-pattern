package com.strangler.demo.controller;

import com.strangler.demo.entity.Book;
import com.strangler.demo.facade.BookFacade;
import com.strangler.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookFacade bookFacade;

    public BookController(BookFacade bookFacade) {
        this.bookFacade = bookFacade;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookFacade.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookFacade.getBookById(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookFacade.createBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookFacade.deleteBook(id);
    }
}