package com.brli.service.impl;

import com.brli.dao.ResourceDao;
import com.brli.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    ResourceDao resourceDao;

    @Override
    public boolean openURL(String url, String password) {
        return resourceDao.readResource(url, password);
    }
}
