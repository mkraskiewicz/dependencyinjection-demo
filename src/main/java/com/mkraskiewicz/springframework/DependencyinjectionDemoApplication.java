package com.mkraskiewicz.springframework;

import com.mkraskiewicz.springframework.controllers.MyController;
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
	}
}
