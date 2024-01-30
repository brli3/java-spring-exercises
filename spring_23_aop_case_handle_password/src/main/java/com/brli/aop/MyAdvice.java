package com.brli.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.brli.service.ResourceService.openURL(..))")
    private void servicePt() {}
    @Around("servicePt()")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            if (args[i].getClass().equals(String.class)) {
                args[i] = args[i].toString().trim();
            }
        }
        System.out.println(Arrays.toString(args));
        Object ret = pjp.proceed(args);
        return ret;
    }
}
