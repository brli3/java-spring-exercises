package com.brli.service.impl;

import com.brli.dao.LogDao;
import com.brli.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    LogDao logDao;

    @Override
    public void log(String out, String in, Double money) {
        logDao.log("transfer from " + out + " to " + in + ", amount: " + money);
    }
}
