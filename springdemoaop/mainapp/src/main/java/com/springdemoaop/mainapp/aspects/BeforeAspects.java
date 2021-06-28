package com.springdemoaop.mainapp.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAspects extends BaseAspect
{
    @Before( "daoInterfacesPackagePointcut()" )
    public void daoLogging()
    {
        System.out.println( "Logging before any DAO method" );
    }

    @Before( "daoInterfacesPackagePointcut()" )
    public void daoAnalytics()
    {
        System.out.println( "executing analytics before any DAO method" );
    }


}
