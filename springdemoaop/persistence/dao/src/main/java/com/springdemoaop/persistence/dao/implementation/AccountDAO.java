package com.springdemoaop.persistence.dao.implementation;

import com.springdemoaop.common.entities.Account;
import com.springdemoaop.persistence.dao.interfaces.IAccountDAO;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAO /*extends BaseDAO<Account>*/ implements IAccountDAO
{
    @Override
    public Account addAccount( Account account )
    {
        System.out.println( "ADDING ACCOUNT" );

        return account;
    }

    @Override
    public Account getAccountDetails( Account account )
    {
        System.out.println( "GETTING ACCOUNT DETAILS" );

        return account;
    }
}
