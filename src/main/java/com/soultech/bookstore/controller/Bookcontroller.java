package com.soultech.bookstore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Bookcontroller {

    public ResponseEntity<String> addBook(@RequestBody Book book) {

    }
}
