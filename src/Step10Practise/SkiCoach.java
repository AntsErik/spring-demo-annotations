package Step10Practise;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

public class SkiCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SkiCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Ski 10km for the day.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
