package com.springdemoAnnotations.common.models;

import com.springdemoAnnotations.common.models.interfaces.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService
{
    private String[] _data =
    {
        "Random Fortune #1",
        "Random Fortune #2",
        "Random Fortune #3"
    };

    private Random _random = new Random(  );

    @Override
    public String getFortune()
    {
        int index = _random.nextInt( _data.length );

        return _data[index];
    }
}
