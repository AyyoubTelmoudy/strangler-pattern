package com.strangler.demo.facade;

import com.strangler.demo.model.Book;

import java.util.List;

public interface BookFacade {

    public List<Book> getAllBooks() ;

    public Book getBookById(Long id);
    public Book createBook(Book book) ;

    public void deleteBook(Long id) ;
}
