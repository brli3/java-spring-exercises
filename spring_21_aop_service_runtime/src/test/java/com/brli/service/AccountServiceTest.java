package com.brli.service;


import com.brli.config.SpringConfig;
import com.brli.domain.Account;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SpringConfig.class})
class AccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Test
    void findById() {
        Account account = accountService.findById(1);
        System.out.println(account);
    }
    @Test
    void findAll() {
        List<Account> accounts = accountService.findAll();
        System.out.println(accounts);
    }
}