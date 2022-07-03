package com.emma.bookz.service;

import com.emma.bookz.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookService {
    List<Book> getAllBooks();
}
