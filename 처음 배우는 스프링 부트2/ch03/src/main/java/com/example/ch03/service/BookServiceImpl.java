package com.example.ch03.service;

import com.example.ch03.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public List<Book> getBookList() {
        return null;
    }
}
