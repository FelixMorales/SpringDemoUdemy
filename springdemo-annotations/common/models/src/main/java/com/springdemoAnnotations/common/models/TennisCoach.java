package com.springdemoAnnotations.common.models;

import com.springdemoAnnotations.common.models.interfaces.FortuneService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach extends BaseCoach
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

    @Override
    public String getDailyWorkout()
    {
        return "Practice your backhand volley";
    }


    @PostConstruct
    public void SpringStartUp()
    {
        System.out.println( "TennisCoach: Inside method SpringStartUp" );
    }

    @PreDestroy
    public void SpringDestroy() throws Exception
    {
        System.out.println( "TennisCoach: Inside method SpringDestroy" );
    }
}
