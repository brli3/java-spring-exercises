package com.brli.dao.impl;

import com.brli.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private int connectionNum;
    private String databaseName;

    @Override
    public void save() {
        System.out.printf("book dao save %d, %s \n ...",
                connectionNum, databaseName);
        //System.out.println("book dao save ...");
    }

}
