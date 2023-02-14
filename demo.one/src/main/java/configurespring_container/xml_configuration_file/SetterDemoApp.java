package configurespring_container.xml_configuration_file;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // load the spring config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configurespring_container/"
                        + "xml_configuration_file/applicationContext.xml");
        // retrieve bean from spring container
        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
        //call method on the bean
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());
        // call new methods to get literal values
        System.out.println(coach.getTeam());
        System.out.println(coach.getEmailAddress());
        //close the context
        context.close();
    }
}
