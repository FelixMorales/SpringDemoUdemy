package com.springdemo.app;


import com.springdemo.common.models.CricketCoach;
import com.springdemo.common.models.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp
{
    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean( "myCoach", Coach.class );

        System.out.println( "Spring App" );
        System.out.println( theCoach.getDailyWorkout() );
        System.out.println( theCoach.getDailyFortune() );

        context.close();

    }
}
