package com.springdemo.common.models;

import com.springdemo.common.models.interfaces.Coach;
import com.springdemo.common.models.interfaces.FortuneService;

public class CricketCoach implements Coach
{
    private FortuneService _fortuneService;
    private String _team;
    private String _emailAddress;

    public CricketCoach()
    {
        System.out.println( "Inside CricketCoach cons no-args" );
    }

    public String getTeam()
    {
        return _team;
    }

    public void setTeam( String team )
    {
        System.out.println( "Inside CricketCoach setter Team method" );
        _team = team;
    }

    public String getEmailAddress()
    {
        return _emailAddress;
    }

    public void setEmailAddress( String emailAddress )
    {
        System.out.println( "Inside CricketCoach setter EmailAddress method" );
        _emailAddress = emailAddress;
    }

    public FortuneService getFortuneService()
    {
        System.out.println( "Inside CricketCoach getter method" );
        return _fortuneService;
    }

    public void setFortuneService( FortuneService fortuneService )
    {
        System.out.println( "Inside CricketCoach setter method" );
        _fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Practice fast bowling for 15min";
    }

    @Override
    public String getDailyFortune()
    {
        return _fortuneService.getFortune();
    }
}
