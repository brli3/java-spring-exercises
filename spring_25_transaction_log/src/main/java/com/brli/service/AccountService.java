package com.brli.service;

import com.brli.domain.Account;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

public interface AccountService {
    @Transactional
    void transfer(String out, String in, Double money) throws IOException;
}
