package com.springdemoaop.mainapp;

import com.springdemoaop.common.EntityFactory;
import com.springdemoaop.common.entities.Account;
import com.springdemoaop.mainapp.config.AppConfig;
import com.springdemoaop.persistence.dao.interfaces.IAccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( AppConfig.class );

        IAccountDAO accountDAO = context.getBean( "accountDAO", IAccountDAO.class );

        Account account = EntityFactory.createAccount();
        account.setId( 1 );

        accountDAO.addAccount( account );

        System.out.println( "-------------------------------------- \n" );
        accountDAO.getAccountDetails( account );

        context.close();
    }
}
