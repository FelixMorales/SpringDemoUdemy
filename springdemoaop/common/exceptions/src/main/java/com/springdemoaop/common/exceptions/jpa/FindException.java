package com.springdemoaop.common.exceptions.jpa;

import com.springdemoaop.common.exceptions.BaseException;

public class FindException extends BaseException
{
    public FindException( Exception e, String str )
    {
        super( e, str );
    }
}
