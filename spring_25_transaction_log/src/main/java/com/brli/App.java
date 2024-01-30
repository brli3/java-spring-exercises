package com.brli;

import com.brli.domain.Account;
import com.brli.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.brli");
        AccountService accountService = ctx.getBean(AccountService.class);
    }
}
