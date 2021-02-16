package com.springdemo.app;

import com.springdemo.common.models.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp
{
    public static void main(String[] args){
        System.out.println( "BeanLifeCycleDemoApp" );

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        Coach theCoach = context.getBean( "myCoach", Coach.class );


        System.out.println( theCoach.getDailyWorkout() ) ;
        System.out.println( theCoach.getDailyFortune() ) ;

        context.close();

    }
}
