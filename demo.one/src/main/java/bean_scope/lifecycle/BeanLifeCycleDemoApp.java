package bean_scope.lifecycle;

import configurespring_container.xml_configuration_file.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean_scope/beanlifecycle.xml");
        //retrieve bean from spring container
        Coach alfaCoach = context.getBean("Coach", Coach.class);

        System.out.println(alfaCoach.getDailyWorkout());

        //close the context
        context.close();


    }
}
