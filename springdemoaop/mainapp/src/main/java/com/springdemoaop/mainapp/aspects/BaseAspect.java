package com.springdemoaop.mainapp.aspects;

import org.aspectj.lang.annotation.Pointcut;

public abstract class BaseAspect
{
    @Pointcut("execution( * com.springdemoaop.persistence.dao.interfaces.*.*( .. ))" )
    protected void daoInterfacesPackagePointcut() {};
}
