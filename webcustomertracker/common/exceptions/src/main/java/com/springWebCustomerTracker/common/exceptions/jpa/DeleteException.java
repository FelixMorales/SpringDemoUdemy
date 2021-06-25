package com.springWebCustomerTracker.common.exceptions.jpa;

import com.springWebCustomerTracker.common.exceptions.BaseException;

public class DeleteException extends BaseException
{
    public DeleteException( Exception e, String str )
    {
        super( e, str );
    }
}
