package com.chiku.xmlexample;

public class TrackCoach implements Coach{
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "run a hard 5k";
    }

    public String getDailyFortune() {
        return "just do it! " + this.fortuneService.getFortune();
    }

    /// add an init method
    public void doMyStartUpStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanUpStuff(){
        System.out.println("TrackCoack: inside method doMyCleanUpStuff");
    }
}
