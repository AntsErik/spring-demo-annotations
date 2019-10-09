package Step10Practise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;
import com.luv2code.springdemo.SwimCoach;

@Configuration
@PropertySource("classpath:sport.properties")
public class SkiConfig {
	
	//define bean for our HardCodedFortune service
	@Bean
	public FortuneService singleHardCodedFortune() {
		return new SingleHardCodedFortune();
	}
	
	//define bean for SkiCoach and inject dependency
	@Bean
	public Coach skiCoach() {
		return new SkiCoach(singleHardCodedFortune());
	}

}
