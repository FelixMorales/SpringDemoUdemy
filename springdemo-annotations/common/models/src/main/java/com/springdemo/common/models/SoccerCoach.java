package com.springdemo.common.models;

import com.springdemo.common.models.interfaces.Coach;

public class SoccerCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "do 15 free kicks";
    }

    @Override
    public String getDailyFortune()
    {
        return null;
    }
}
