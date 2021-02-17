package com.springdemo.app;


import com.springdemo.common.models.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp
{
    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach theCoach = context.getBean( "myCricketCoach", CricketCoach.class );

        System.out.println( "Setter Demo App" );
        System.out.println( theCoach.getDailyWorkout() );
        System.out.println( theCoach.getDailyFortune() );
        System.out.println( theCoach.getTeam() );
        System.out.println( theCoach.getEmailAddress() );

        context.close();

    }
}
