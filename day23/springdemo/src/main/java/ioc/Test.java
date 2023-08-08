package ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ioc2,ioc")
public class Test { 

	public static void main(String[] args) {
		 SpringApplication.run(Test.class, args);
	}
}
