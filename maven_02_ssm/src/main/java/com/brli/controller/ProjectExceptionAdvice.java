package com.brli.controller;

import com.brli.exception.BusinessException;
import com.brli.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException exception) {
        // 1. Logging
        // 2. Send msg to devops
        // 3. Send msg to devs
        return new Result(exception.getCode(), null, exception.getMessage());
    }
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException exception) {
        return new Result(exception.getCode(), null, exception.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public Result doException(Exception exception) {
        System.out.println("Exception handled ... ");
        return new Result(Code.SYSTEM_UNKNOWN_ERR, null, "System busy ...");
    }

}