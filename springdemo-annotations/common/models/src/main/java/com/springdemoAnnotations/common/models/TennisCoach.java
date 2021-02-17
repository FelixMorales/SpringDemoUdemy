package com.springdemoAnnotations.common.models;

import com.springdemoAnnotations.common.models.interfaces.FortuneService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach extends BaseCoach implements DisposableBean
{

    public TennisCoach()
    {
        System.out.println( "TennisCoach: Inside default constructor" );
    }

    @Override
    @Autowired
    protected void setFortuneService( @Qualifier( "randomFortuneService" ) FortuneService fortuneService )
    {
        System.out.println( "TennisCoach: Inside private method setFortuneService" );
        _fortuneService = fortuneService;
    }

    /*@Autowired
    public TennisCoach(FortuneService fortuneService)
    {
        System.out.println( "TennisCoach: Inside constructor FortuneService arg" );
        _fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout()
    {
        return "Practice your backhand volley";
    }

    // Spring init method
    public void SpringStartUp()
    {
        System.out.println( "TennisCoach: Inside method SpringStartUp" );
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println( "TennisCoach: Inside method SpringDestroy" );
    }
}
