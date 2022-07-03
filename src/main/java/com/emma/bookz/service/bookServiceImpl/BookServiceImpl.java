package com.emma.bookz.service.bookServiceImpl;

import com.emma.bookz.domain.Book;
import com.emma.bookz.repository.BookRepository;
import com.emma.bookz.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    //@Entity
    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
