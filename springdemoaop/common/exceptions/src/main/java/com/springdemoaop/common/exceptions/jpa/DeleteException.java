package com.springdemoaop.common.exceptions.jpa;

import com.springdemoaop.common.exceptions.BaseException;

public class DeleteException extends BaseException
{
    public DeleteException( Exception e, String str )
    {
        super( e, str );
    }
}
