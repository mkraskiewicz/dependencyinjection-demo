package com.mkraskiewicz.springframework;

import com.mkraskiewicz.springframework.beans.JmsUserBean;
import com.mkraskiewicz.springframework.beans.UserBean;
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
		//Get Beans
		MyController controller = (MyController) ctx.getBean(MY_CONTROLLER);
        UserBean user = ctx.getBean(UserBean.class);
        JmsUserBean jmsUser = ctx.getBean(JmsUserBean.class);

        //Running DI controllers
        System.out.println(controller.sayHello());

        //Checking configurated beans
        System.out.println(user.toString());
        System.out.println(jmsUser.toString());
    }
}
