package com.springdemoaop.common.entities;

public class Account extends BaseEntity
{
    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder( "Account{" );
        sb.append( super.toString() );
        sb.append( '}' );
        return sb.toString();
    }
}
