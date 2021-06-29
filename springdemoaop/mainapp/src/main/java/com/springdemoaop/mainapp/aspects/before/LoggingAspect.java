package com.springdemoaop.mainapp.aspects.before;

import com.springdemoaop.mainapp.aspects.BaseAspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order( BeforeAspectsOrder.Constants.LOCAL_LOGGING )
public class LoggingAspect extends BaseAspect
{
    @Before( "daoInterfacesPackagePointcut()" )
    public void daoLogging()
    {
        System.out.println( "executing Logging before any DAO method" );
    }
}
