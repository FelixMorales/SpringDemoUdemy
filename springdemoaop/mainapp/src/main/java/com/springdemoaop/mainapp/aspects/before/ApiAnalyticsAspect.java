package com.springdemoaop.mainapp.aspects.before;

import com.springdemoaop.mainapp.aspects.BaseAspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order( BeforeAspectsOrder.Constants.API_ANALYTICS )
public class ApiAnalyticsAspect extends BaseAspect
{
    @Before( "daoInterfacesPackagePointcut()" )
    public void daoAnalytics()
    {
        System.out.println( "executing Api Analytics before any DAO method" );
    }
}
