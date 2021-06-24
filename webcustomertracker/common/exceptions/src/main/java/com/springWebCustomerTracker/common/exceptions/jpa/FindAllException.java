package com.springWebCustomerTracker.common.exceptions.jpa;

import com.springWebCustomerTracker.common.exceptions.BaseException;

public class FindAllException extends BaseException
{
    public FindAllException( Exception e, String str )
    {
        super( e, str );
    }
}
