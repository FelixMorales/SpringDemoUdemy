package com.springWebCustomerTracker.common.exceptions.jpa;

import com.springWebCustomerTracker.common.exceptions.BaseException;

public class UpdateException extends BaseException
{
    public UpdateException( Exception e, String str )
    {
        super( e, str );
    }
}
