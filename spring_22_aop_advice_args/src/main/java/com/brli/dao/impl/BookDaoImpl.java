package com.brli.dao.impl;

import com.brli.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id, String password) {
        System.out.println("id: " + id);
        return "brli";
    }
}
