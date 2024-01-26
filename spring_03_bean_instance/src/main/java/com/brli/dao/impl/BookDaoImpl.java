package com.brli.dao.impl;

import com.brli.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private BookDaoImpl() {
        System.out.println("bookDao constructor running");
    }
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
