package com.example.ch03.service;

import com.example.ch03.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    List<Book> getBookList();
}
