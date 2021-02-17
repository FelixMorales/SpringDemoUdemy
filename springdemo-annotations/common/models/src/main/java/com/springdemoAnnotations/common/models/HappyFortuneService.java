package com.springdemoAnnotations.common.models;

import com.springdemoAnnotations.common.models.interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService
{
    @Override
    public String getFortune()
    {
        return "Today is your LuckyDay!";
    }
}
