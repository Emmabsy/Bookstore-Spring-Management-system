package com.emma.bookz.controller;

import com.emma.bookz.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    //handler method to handle list of books and return model and view
    @GetMapping("/books")
    public String listBooks(Model model){
        model.addAttribute("book", bookService.getAllBooks());
                return "books";

    }
}
