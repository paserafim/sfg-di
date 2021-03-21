package paserafim.framework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import paserafim.framework.sfgdi.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SfgDiApplication.class, args);
		// by default the controller name comes in lowercase
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHelloWorld();

		System.out.println(greeting);

	}

}
