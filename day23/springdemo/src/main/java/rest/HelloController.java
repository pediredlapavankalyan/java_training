package rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {
	
	@GetMapping("/hello") 
	public String sayHello() {
		return "Hello";
	}
	
	@GetMapping("/wish") 
	public String wishUser(@RequestParam(name="fullname", defaultValue = "Guest") String name) {
		return  "Hello " + name;
	}

	@GetMapping("/goodbye/{name}") 
	public String sayGoodbye(@PathVariable(name = "name") String name) {
		return  "GoodBye " + name;
	}
	
}
