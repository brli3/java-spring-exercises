package com.brli.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    //@Pointcut("execution(* com.brli.dao.impl.BookDaoImpl.update())")
    //@Pointcut("execution(* com.*.*.*.*.update())")
    //@Pointcut("execution(* com.*.*.*.update())")
    //@Pointcut("execution(* *..*(..))")
    //@Pointcut("execution(* *..*e(..))")
    @Pointcut("execution(* com.brli.*.*Service.find*(..))")
    private void pt() {}
    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
