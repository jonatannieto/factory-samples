package springboot;

import com.telefonica.controllers.GreetingController;
import com.telefonica.controllers.GreetingControllerWithFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.telefonica")
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        GreetingController controller = (GreetingController) ctx.getBean("greetingController");

        controller.sayHello();

        GreetingControllerWithFactory greetingControllerWithFactory = new GreetingControllerWithFactory();
        greetingControllerWithFactory.sayHello("Russian");
    }
}
