package com.brli.factory;

import com.brli.dao.OrderDao;
import com.brli.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        System.out.println("order factory set up..");
        return new OrderDaoImpl();
    }
}
