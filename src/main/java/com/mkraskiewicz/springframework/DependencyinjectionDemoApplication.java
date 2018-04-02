package com.mkraskiewicz.springframework;

import com.mkraskiewicz.springframework.controllers.ConstructorInjectedController;
import com.mkraskiewicz.springframework.controllers.MyController;
import com.mkraskiewicz.springframework.controllers.PropertyInjectedController;
import com.mkraskiewicz.springframework.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyinjectionDemoApplication {

	private final static String MY_CONTROLLER = "myController";
	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyinjectionDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean(MY_CONTROLLER);
		controller.setMessage("Hello World");
		controller.printMessage();


		//Running DI controllers
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
    }
}
