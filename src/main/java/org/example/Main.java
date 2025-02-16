package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Footballer footballer = context.getBean(Footballer.class);
        FootballClub footballClub = context.getBean(FootballClub.class);
        Coach coach = context.getBean(Coach.class);

        System.out.println("Footballer info - " + footballer.getFootballerInfo());
        System.out.println("Football club: " + footballClub.getClubName());
        System.out.println("Main coach: " + coach.getCoachName());
    }
}