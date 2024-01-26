package com.brli.service.impl;

import com.brli.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service save ...");
    }
}
