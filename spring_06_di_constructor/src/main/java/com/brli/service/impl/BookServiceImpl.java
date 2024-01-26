package com.brli.service.impl;

import com.brli.dao.BookDao;
import com.brli.dao.UserDao;
import com.brli.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }
    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
}
