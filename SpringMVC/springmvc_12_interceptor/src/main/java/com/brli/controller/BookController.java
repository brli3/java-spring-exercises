package com.brli.controller;

import com.brli.domain.Book;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/books")
public class BookController {
    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println("book save ..." + book);
        return "{'module':'book save'}";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("book getById " + id);
        return "{'module':'book getById'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("book delete ..." + id);
        return "{'module' : 'book delete'}";
    }

    @PutMapping
    public String update(Book book) {
        System.out.println("book update ... " + book);
        return "{'module' : 'book update '}";
    }

    @GetMapping
    public String getAll() {
        System.out.println("book getAll");
        return "{'module' : 'book getAll'}";
    }
}
