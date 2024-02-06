package com.brli;

import com.brli.domain.Book;
import com.brli.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookServiceImplTest {

    @Autowired
    private BookService bookService;

    @Test
    public void save() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void getById() {
        Book book = bookService.getById(2);
        System.out.println(book);
    }

    @Test
    public void getAll() {
        List<Book> books = bookService.getAll();
        System.out.println(books);
    }
}