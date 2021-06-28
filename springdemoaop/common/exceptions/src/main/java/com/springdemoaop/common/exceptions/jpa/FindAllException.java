package com.springdemoaop.common.exceptions.jpa;

import com.springdemoaop.common.exceptions.BaseException;

public class FindAllException extends BaseException
{
    public FindAllException( Exception e, String str )
    {
        super( e, str );
    }
}
