package com.springdemoAnnotations.app;


import com.springdemoAnnotations.common.models.BaseCoach;
import com.springdemoAnnotations.common.utilities.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp
{
    public static void main(String[] args){

        System.out.println( "AnnotationDemoApp" );

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( SpringConfig.class );

        BaseCoach theCoach = context.getBean( "swimCoach", BaseCoach.class );

        System.out.println( theCoach.getEmail() );
        System.out.println( theCoach.getTeam() );
        System.out.println( theCoach.getDailyWorkout() );
        System.out.println( theCoach.getDailyFortune() );

        context.close();
    }
}
