package com.brli.dao.impl;

import com.brli.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    // bean initialisation
    public void init() {
        System.out.println("bookDao init ...");
    }

    public void destroy() {
        System.out.println("bookDao destroyed ...");
    }
}
