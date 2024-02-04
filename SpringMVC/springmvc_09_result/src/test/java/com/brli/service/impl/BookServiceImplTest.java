package com.brli.service.impl;

import com.brli.config.SpringConfig;
import com.brli.domain.Book;
import com.brli.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
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
        Book book = bookService.getById(1);
        System.out.println(book);
    }

    @Test
    public void getAll() {
        List<Book> books = bookService.getAll();
        System.out.println(books);
    }
}