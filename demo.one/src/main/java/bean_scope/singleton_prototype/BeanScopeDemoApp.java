package bean_scope.singleton_prototype;

import configurespring_container.xml_configuration_file.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean_scope/beanscope.xml");
        //retrieve bean from spring container
        Coach alfaCoach = context.getBean("Coach", Coach.class);
        Coach betaCoach = context.getBean("Coach", Coach.class);

        // check if they are the same
        boolean result = (alfaCoach == betaCoach);

        // print our results
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location of the alfaCoach: " + alfaCoach);
        System.out.println("\nPointing to the same betaCoach: " + betaCoach + "\n");

        //close the context
        context.close();


    }
}
