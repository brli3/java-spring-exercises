package com.brli.factory;

import com.brli.dao.UserDao;
import com.brli.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
