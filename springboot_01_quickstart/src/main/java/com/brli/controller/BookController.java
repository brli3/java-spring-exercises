package com.brli.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/{id}")
    public String getById(@PathVariable("id") int id) {
        System.out.println("id ==> " + id);
        return "hello, springboot";
    }

}
