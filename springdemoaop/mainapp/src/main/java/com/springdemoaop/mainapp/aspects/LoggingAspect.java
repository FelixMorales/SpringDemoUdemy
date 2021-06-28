package com.springdemoaop.mainapp.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect
{
    @Before( "execution(* com.springdemoaop.persistence.dao.interfaces.IAccountDAO.testAddAccount( .. ))" )
    public void beforeAddAccountAdvice()
    {
        System.out.println( "Logging before add account" );
    }
}
