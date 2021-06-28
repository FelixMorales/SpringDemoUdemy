package com.springdemoaop.mainapp;

import com.springdemoaop.common.EntityFactory;
import com.springdemoaop.mainapp.config.AppConfig;
import com.springdemoaop.persistence.dao.interfaces.IAccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( AppConfig.class );

        IAccountDAO accountDAO = context.getBean( "accountDAO", IAccountDAO.class );

        accountDAO.testAddAccount( EntityFactory.createAccount() );

        context.close();
    }
}
