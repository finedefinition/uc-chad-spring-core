package configurespring_container.xml_configuration_file;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // load the spring config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configurespring_container/"
                        + "xml_configuration_file/applicationContext.xml");
        // retrieve bean from spring container
        Coach coach = context.getBean("myCricketCoach", CricketCoach.class);
        //call method on the bean
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());
        //close the context
        context.close();
    }
}
