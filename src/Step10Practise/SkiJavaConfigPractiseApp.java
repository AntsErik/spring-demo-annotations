package Step10Practise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SkiJavaConfigPractiseApp {

	public static void main(String[] args) {
		
		//read spring configuration java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SkiConfig.class);
		
		//get the bean from spring container
		SkiCoach theCoach = context.getBean("skiCoach", SkiCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call a method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
