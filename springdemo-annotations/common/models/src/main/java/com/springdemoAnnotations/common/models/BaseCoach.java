package com.springdemoAnnotations.common.models;

import com.springdemoAnnotations.common.models.interfaces.Coach;
import com.springdemoAnnotations.common.models.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public abstract class BaseCoach implements Coach
{
    @Value( "${foo.email}" )
    private String _email;

    @Value( "${foo.team}" )
    private String _team;

    protected FortuneService _fortuneService;

    public String getEmail()
    {
        return _email;
    }

    public String getTeam()
    {
        return _team;
    }

    public abstract void setFortuneService(FortuneService fortuneService);

    @Override
    public String getDailyFortune()
    {
        return _fortuneService.getFortune();
    }
}
