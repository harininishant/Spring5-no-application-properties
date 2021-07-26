package io.pragra.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMobile {

    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(MobileConfig.class);
      //context.getBean("mobile", Mobile.class).getAirtelFromMobile();

        Mobile mobile = context.getBean("mobile", Mobile.class);
        // the object mobile will have the same location address
        // irrespective of the var assigned is diff, it over laps existing data
        //hence we use @scope to have diff location address
        Mobile mobile1 =context.getBean("mobile", Mobile.class);
        System.out.println(mobile);
        System.out.println(mobile1);

        //context.getBean("airTel",AirTel.class).calling();

    }
}
