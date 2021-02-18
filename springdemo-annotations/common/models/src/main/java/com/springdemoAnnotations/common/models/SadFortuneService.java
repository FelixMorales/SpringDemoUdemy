package com.springdemoAnnotations.common.models;

import com.springdemoAnnotations.common.models.interfaces.FortuneService;

public class SadFortuneService implements FortuneService
{
    @Override
    public String getFortune()
    {
        return "today is a sad day";
    }
}
