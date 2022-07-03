package com.emma.bookz.controller;

import com.emma.bookz.service.BookService;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    //hamdler method to handle list of books and return model and view
    public String listBooks
}
