package com.brli;

import com.brli.dao.BookDao;
import com.brli.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        // Singleton
        System.out.println("bookDao: " + bookDao);
        System.out.println("bookDao2: " + bookDao2);
    }
}
