package jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class TestProducts implements CommandLineRunner {
	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(TestProducts.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//            for ( var p : productRepo.findAll()) {
//            	System.out.printf("%-20s %-20s\n", 
//            			p.getName(), p.getCategory().getDescription());

		for (var p : productRepo.getAllNameDesc()) {
			System.out.printf("%-20s %-20s\n", p.getName(), p.getCategory().getDescription());

		}
	}

}
