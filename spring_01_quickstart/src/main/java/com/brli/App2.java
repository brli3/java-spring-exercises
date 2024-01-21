package com.brli;

import com.brli.dao.BookDao;
import com.brli.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        // 3. get IoC container
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4. get a bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
