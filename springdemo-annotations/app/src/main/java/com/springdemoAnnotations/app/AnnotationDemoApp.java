package com.springdemoAnnotations.app;


import com.springdemoAnnotations.common.models.BaseCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp
{
    public static void main(String[] args){

        System.out.println( "AnnotationDemoApp" );

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml" );

        BaseCoach theCoach = context.getBean( "tennisCoach", BaseCoach.class );

        System.out.println( theCoach.getEmail() );
        System.out.println( theCoach.getDailyWorkout() );
        System.out.println( theCoach.getDailyFortune() );

        context.close();
    }
}
