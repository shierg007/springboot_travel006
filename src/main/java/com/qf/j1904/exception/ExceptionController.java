package com.qf.j1904.exception;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = UnauthorizedException.class)//处理访问方法时权限不足问题
    public String permissionErrorHandler(HttpServletRequest req, Exception e)  {
        return "exception";
    }

    @ExceptionHandler(value = AuthorizationException.class)//
    public String accountErrorHandler(HttpServletRequest req, Exception e)  {
        return "login";
    }

//    @ExceptionHandler(value = IncorrectCredentialsException.class)//
//    public String incorrectCredentialsErrorHandler(HttpServletRequest req, Exception e)  {
//        return "login";
//    }
}
