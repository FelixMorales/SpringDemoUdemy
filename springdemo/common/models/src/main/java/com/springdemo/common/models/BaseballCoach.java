package com.springdemo.common.models;

import com.springdemo.common.models.interfaces.Coach;
import com.springdemo.common.models.interfaces.FortuneService;

public class BaseballCoach implements Coach
{
    private FortuneService _fortuneService;

    public BaseballCoach( FortuneService fortuneService)
    {
        _fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "spend 30min on batting practice";
    }

    @Override
    public String getDailyFortune()
    {
        return _fortuneService.getFortune();
    }
}
