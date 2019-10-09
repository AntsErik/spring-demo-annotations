package Step10Practise;

import com.luv2code.springdemo.FortuneService;

public class SingleHardCodedFortune implements FortuneService {

	@Override
	public String getFortune() {
		return "This is some tough luck!";
	}

}
