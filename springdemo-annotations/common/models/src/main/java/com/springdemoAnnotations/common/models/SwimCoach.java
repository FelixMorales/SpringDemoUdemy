package com.springdemoAnnotations.common.models;

import com.springdemoAnnotations.common.models.interfaces.FortuneService;

public class SwimCoach extends BaseCoach
{
    @Override
    public void setFortuneService( FortuneService fortuneService )
    {
        _fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Swim 1000m as a warm up.";
    }
}
