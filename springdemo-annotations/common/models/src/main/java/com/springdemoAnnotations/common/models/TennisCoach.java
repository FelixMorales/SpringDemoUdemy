package com.springdemoAnnotations.common.models;

import com.springdemoAnnotations.common.models.interfaces.Coach;
import com.springdemoAnnotations.common.models.interfaces.FortuneService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach, DisposableBean
{
    private FortuneService _fortuneService;

    @Override
    public String getDailyWorkout()
    {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune()
    {
        return "Just do it: "+ _fortuneService.getFortune();
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
