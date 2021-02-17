package com.springdemo.common.models;

import com.springdemo.common.models.interfaces.FortuneService;

public class HappyFortuneService implements FortuneService
{
    @Override
    public String getFortune()
    {
        return "Today is your lucky day!";
    }
}
