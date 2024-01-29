package com.brli;

import com.brli.config.SpringConfig;
import com.brli.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        //bookDao.update();
        bookDao.save();
        System.out.println(bookDao);
        System.out.println(bookDao.getClass()); // proxy object
    }
}
