package com.springdemoAnnotations.common.utilities;

import com.springdemoAnnotations.common.models.BaseCoach;
import com.springdemoAnnotations.common.models.SadFortuneService;
import com.springdemoAnnotations.common.models.SwimCoach;
import com.springdemoAnnotations.common.models.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@Configuration
//@ComponentScan("com.springdemoAnnotations.common.models")
@PropertySource("classpath:sport.properties")
public class SpringConfig
{
    @Value("${root.logger.level}")
    private String rootLoggerLevel;

    @Value("${printed.logger.level}")
    private String printedLoggerLevel;

    @PostConstruct
    public void initLogger() {

        // parse levels
        Level rootLevel = Level.parse( rootLoggerLevel);
        Level printedLevel = Level.parse(printedLoggerLevel);

        // get logger for app context
        Logger applicationContextLogger = Logger.getLogger( AnnotationConfigApplicationContext.class.getName());

        // get parent logger
        Logger loggerParent = applicationContextLogger.getParent();

        // set root logging level
        loggerParent.setLevel(rootLevel);

        // set up console handler
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(printedLevel);
        consoleHandler.setFormatter(new SimpleFormatter());

        // add handler to the logger
        loggerParent.addHandler(consoleHandler);
    }

    @Bean //Singleton Bean
    public FortuneService sadFortuneService()
    {
        return new SadFortuneService();
    }

    @Bean //Singleton Bean
    public BaseCoach swimCoach()
    {
        BaseCoach swimCoach = new SwimCoach();
        swimCoach.setFortuneService( sadFortuneService() );

        return  swimCoach;
    }
}
