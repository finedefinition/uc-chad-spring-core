package configurespring_container.java_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("configurespring_container/"
                + "java_annotations/applicationContext.xml");
        //retrieve bean from spring container
        Car car = context.getBean("Tesla", Car.class);
        //call a method on the bean
        System.out.println(car.get());
        //close the context
        context.close();
    }
}
