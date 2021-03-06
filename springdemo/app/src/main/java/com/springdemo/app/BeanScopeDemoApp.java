package com.springdemo.app;

import com.springdemo.common.models.TrackCoach;
import com.springdemo.common.models.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp
{
    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean( "myCoach", Coach.class );
        Coach alphaCoach = context.getBean( "myCoach", Coach.class );

        boolean result = (theCoach == alphaCoach);

        System.out.println( "BeanScopeDemoApp" );
        System.out.println( "result = "+result );

        context.close();

    }
}
