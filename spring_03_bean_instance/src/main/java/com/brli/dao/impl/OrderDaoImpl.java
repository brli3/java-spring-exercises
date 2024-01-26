package com.brli.dao.impl;

import com.brli.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("Order dao save ...");
    }
}
