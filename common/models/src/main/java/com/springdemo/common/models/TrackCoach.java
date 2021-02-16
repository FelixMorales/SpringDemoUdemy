package com.springdemo.common.models;

import com.springdemo.common.models.interfaces.Coach;
import com.springdemo.common.models.interfaces.FortuneService;

public class TrackCoach implements Coach
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
}
