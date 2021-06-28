package com.springdemoaop.common.exceptions.jpa;

import com.springdemoaop.common.exceptions.BaseException;

public class UpdateException extends BaseException
{
    public UpdateException( Exception e, String str )
    {
        super( e, str );
    }
}
