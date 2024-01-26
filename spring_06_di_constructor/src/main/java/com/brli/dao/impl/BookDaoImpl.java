package com.brli.dao.impl;

import com.brli.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private int connectionNum;
    private String databaseName;

    public BookDaoImpl(int connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.printf("book dao save %d, %s \n ...",
                connectionNum, databaseName);
        //System.out.println("book dao save ...");
    }

}
