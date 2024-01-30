package com.brli;

import com.brli.config.SpringConfig;
import com.brli.dao.ResourceDao;
import com.brli.service.ResourceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceService resourceService = ctx.getBean(ResourceService.class);
        boolean flag = resourceService.openURL("http://google.com", "root   ");
        System.out.println(flag);

    }
}
