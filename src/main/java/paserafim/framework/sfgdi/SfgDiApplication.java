package paserafim.framework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import paserafim.framework.sfgdi.controllers.ConstrutorInjectedController;
import paserafim.framework.sfgdi.controllers.MyController;
import paserafim.framework.sfgdi.controllers.PropertyInjectedController;
import paserafim.framework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SfgDiApplication.class, args);
		// by default the controller name comes in lowercase
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("-------- Primary bean");
		System.out.println(	myController.sayHelloWorld());
//		String greeting = myController.sayHelloWorld();
//		System.out.println(greeting);

		System.out.println("------------ PropertyInjectedController");
		// by default the controller name comes in lowercase
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------ SetterInjectedController");
		// by default the controller name comes in lowercase
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------ ConstrutorInjectedController");
		// by default the controller name comes in lowercase
		ConstrutorInjectedController construtorInjectedController = (ConstrutorInjectedController) ctx.getBean("construtorInjectedController");
		System.out.println(construtorInjectedController.getGreeting());
	}

}
