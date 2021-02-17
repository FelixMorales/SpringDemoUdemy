package com.springdemoAnnotations.app;


import com.springdemoAnnotations.common.models.BaseCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp
{
    public static void main(String[] args){

        System.out.println( "AnnotationBeanScopeDemoApp" );

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml" );

        BaseCoach theCoach = context.getBean( "tennisCoach", BaseCoach.class );
        BaseCoach alphaCoach = context.getBean( "tennisCoach", BaseCoach.class );

        boolean result = (alphaCoach == theCoach);

        System.out.println( theCoach );
        System.out.println( alphaCoach );
        System.out.println( "Result = "+result );

        context.close();
    }
}
