package com.brli.service.impl;

import com.brli.dao.AccountDao;
import com.brli.domain.Account;
import com.brli.service.AccountService;
import com.brli.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.List;


@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    @Override
    public void transfer(String out, String in, Double money) throws IOException {
        try {
            accountDao.outMoney(out, money);
            int i = 1 / 0;
            accountDao.inMoney(in, money);
        } finally {
            // same transaction as inMoney and outMoney
            // set as a separate transaction
            logService.log(out, in, money);
        }
    }
}
