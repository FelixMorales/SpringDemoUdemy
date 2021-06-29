package com.springdemoaop.mainapp.aspects.before;

import com.springdemoaop.mainapp.aspects.BaseAspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order( BeforeAspectsOrder.Constants.CLOUD_LOGGING )
public class CloudLoggingAspect extends BaseAspect
{
    @Before( "daoInterfacesPackagePointcut()")
    public void daoCloudLogging()
    {
        System.out.println( "executing Cloud Logging before any DAO method" );
    }
}
