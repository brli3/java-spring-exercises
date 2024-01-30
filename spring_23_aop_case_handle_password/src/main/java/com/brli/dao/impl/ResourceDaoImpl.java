package com.brli.dao.impl;

import com.brli.dao.ResourceDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceDaoImpl implements ResourceDao {
    @Override
    public boolean readResource(String url, String password) {
        return password.equals("root");
    }
}
