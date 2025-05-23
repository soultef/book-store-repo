package com.soultech.bookstore.controller;

import com.soultech.bookstore.DTO.BookDTO;
import com.soultech.bookstore.entity.BookEntity;
import com.soultech.bookstore.repository.BookRepository;
import com.soultech.bookstore.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Bookcontroller {
    private final BookService bookService;



    public Bookcontroller(BookService bookService) {
        this.bookService = bookService;

    }

    @PostMapping("/book")
    public ResponseEntity<BookDTO> addBook(@RequestBody BookEntity book) {
       BookDTO bookdto = bookService.createBook(book);
       if (bookdto == null) {
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bookdto);
       }
       return ResponseEntity.status(HttpStatus.CREATED).body(bookdto);

    }
}
