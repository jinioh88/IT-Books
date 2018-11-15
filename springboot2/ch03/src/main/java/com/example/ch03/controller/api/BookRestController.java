package com.example.ch03.controller.api;

import com.example.ch03.domain.Book;
import com.example.ch03.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class BookRestController {
    @Autowired
    private BookService bookService;

//    @GetMapping(path = "/rest/test", produces = MediaType.APPLICATION_JSON_VALUE)
//    public Book getRestBooks() {
//        return bookService.getRestBook();
//    }
}
