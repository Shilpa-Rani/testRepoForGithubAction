package helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/HelloWorld/testCI")
public class TestController {

	@RequestMapping(method = RequestMethod.GET)
	String getMessage() {
		return "Your Automatic Build works!";
	}
	//http://localhost:8080/HelloWorld/testCI
}
