package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")

public class ProjectConfig {
    @Bean
    FootballClub footballClub(){
        return new FootballClub();
    }

    @Bean
    Footballer footballer(){
        return new Footballer();
    }

    @Bean
    Coach coach(){
        return new Coach();
    }
}
