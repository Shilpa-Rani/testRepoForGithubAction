package helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld {

	/**
	 * @author shilpa
	 */
	public static void main(String[] args) {

		SpringApplication.run(HelloWorld.class, args);
		// TODO Auto-generated method stub
		System.out.println("HELLO SHILPA");

//		Greeter greeter = new Greeter();
//	    System.out.println(greeter.sayHello());
	}
}
