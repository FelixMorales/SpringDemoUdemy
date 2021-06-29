package com.springdemoaop.persistence.dao.interfaces;

import com.springdemoaop.common.entities.Account;

public interface IAccountDAO /*extends IBaseDAO<Account>*/
{
    Account addAccount( Account account );

    Account getAccountDetails( Account account );
}
