package com.springWebCustomerTracker.common.exceptions;

public abstract class BaseException extends RuntimeException
{
    public BaseException()
    {
    }

    public BaseException( Exception e, String str )
    {
        super( str, e );
    }
}
