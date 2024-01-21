package com.brli.service.impl;

import com.brli.dao.BookDao;
import com.brli.dao.impl.BookDaoImpl;
import com.brli.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao = new BookDaoImpl();
    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
