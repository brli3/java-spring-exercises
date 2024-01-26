package com.brli.service.impl;

import com.brli.dao.BookDao;
import com.brli.dao.impl.BookDaoImpl;
import com.brli.service.BookService;

public class BookServiceImpl implements BookService {
    // 5. remove object created via 'new'
    //private BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    // 6. setter for object
    // who calls the setter? Contained
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
