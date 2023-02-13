package configurespring_container.xml_configuration_file;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach() {
	}

	// define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Jusd Do It: " + fortuneService.getFortune();
	}

}










