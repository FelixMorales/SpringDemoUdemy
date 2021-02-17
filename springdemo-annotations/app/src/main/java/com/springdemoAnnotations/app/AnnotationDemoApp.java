package com.springdemoAnnotations.app;


import com.springdemoAnnotations.common.models.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp
{
    public static void main(String[] args){

        System.out.println( "AnnotationDemoApp" );

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml" );

        Coach theCoach = context.getBean( "tennisCoach", Coach.class );

        System.out.println( theCoach.getDailyWorkout() );

        context.close();
    }
}
