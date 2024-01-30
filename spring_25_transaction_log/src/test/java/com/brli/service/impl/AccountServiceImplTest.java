package com.brli.service.impl;


import com.brli.config.SpringConfig;
import com.brli.service.AccountService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SpringConfig.class})
class AccountServiceImplTest {
    @Autowired
    AccountService accountService;
    @Test
    public void testTransfer() throws IOException {
        accountService.transfer("Tom", "Jerry", 50d);
    }
}