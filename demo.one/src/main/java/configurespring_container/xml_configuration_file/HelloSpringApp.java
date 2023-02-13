package configurespring_container.xml_configuration_file;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configurespring_container/"
                        + "xml_configuration_file/applicationContext.xml");
        //retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach coach1 = context.getBean("myCoach1", Coach.class);

        //call methods on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach1.getDailyWorkout());

        //close the context
        context.close();
    }
}
