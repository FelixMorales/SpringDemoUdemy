package com.springdemoaop.common;

import com.springdemoaop.common.entities.Account;

public class EntityFactory
{
    public static Account createAccount(){
        return new Account();
    }
}
