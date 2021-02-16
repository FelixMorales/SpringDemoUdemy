package com.springdemo.common.models;

import com.springdemo.common.models.interfaces.Coach;
import com.springdemo.common.models.interfaces.FortuneService;
import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean
{
    private FortuneService _fortuneService;

    public TrackCoach(FortuneService fortuneService)
    {
        _fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "run a hard 5k";
    }

    @Override
    public String getDailyFortune()
    {
        return "Just do it: "+ _fortuneService.getFortune();
    }

    // Spring init method
    public void SpringStartUp()
    {
        System.out.println( "TrackCoach: Inside method SpringStartUp" );
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println( "TrackCoach: Inside method SpringDestroy" );
    }
}
