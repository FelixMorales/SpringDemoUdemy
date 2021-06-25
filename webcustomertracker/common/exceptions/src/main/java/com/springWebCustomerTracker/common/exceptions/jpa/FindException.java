package com.springWebCustomerTracker.common.exceptions.jpa;

import com.springWebCustomerTracker.common.exceptions.BaseException;

public class FindException extends BaseException
{
    public FindException( Exception e, String str )
    {
        super( e, str );
    }
}
