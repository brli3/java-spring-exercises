package com.brli.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.brli.dao.BookDao.update())")
    private void pt() {}
    @Pointcut("execution(int com.brli.dao.BookDao.select())")
    private void pt2() {}

//    @Before("pt()")
    public void before() {
        System.out.println("before advice");
    }
    //@After("pt()")
    public void after() {
        System.out.println("after advice");
    }
    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice");
        // call the original method
        pjp.proceed();
        System.out.println("around after advice");
    }

    @Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice");
        // call the original method
        Object obj = pjp.proceed();
        System.out.println("around after advice");
        return obj;
    }
    public void afterReturning() {
        System.out.println("afterReturning advice");
    }
    public void afterThrowing() {
        System.out.println("afterThrowing advice");
    }

}
