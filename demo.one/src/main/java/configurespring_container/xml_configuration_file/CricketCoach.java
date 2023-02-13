package configurespring_container.xml_configuration_file;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside set  method");
        this.fortuneService = fortuneService;
    }
}
