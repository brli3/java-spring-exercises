package com.brli;

import com.brli.config.SpringConfig;
import com.brli.dao.BookDao;
import com.brli.dao.impl.BookDaoImpl;
import com.brli.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
    }
}
