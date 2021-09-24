package com.chiku.xmlexample;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String name;
    private String email;
    private int age;

    public CricketCoach(){
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CricketCoach{" +
                "fortuneService=" + fortuneService.getFortune() +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
