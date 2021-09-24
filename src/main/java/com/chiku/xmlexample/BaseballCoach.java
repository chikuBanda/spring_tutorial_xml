package com.chiku.xmlexample;

public class BaseballCoach implements Coach{
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "spend 1 hour on batting practice";
    }

    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
