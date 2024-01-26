package com.brli;

import com.brli.dao.BookDao;
import com.brli.service.BookService;
import com.brli.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        BookDao bookDao = (BookDao) ctx.getBean("bookDao") ;

        BookService bookService = (BookService) ctx.getBean("bookService") ;
        bookDao.save();
        // close the container to see the destroy method
        // other JVM closes first
        ctx.registerShutdownHook();
        //ctx.close();
    }
}
