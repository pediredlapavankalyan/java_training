package jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@SpringBootApplication
public class TestSales implements CommandLineRunner {
	@Autowired
	private SalesRepo salesRepo;

	public static void main(String[] args) {
		SpringApplication.run(TestSales.class, args);
	}

	// QBE 
	public void printSales(int qty, int amount) {
		var sale = new Sale();
		sale.setAmount(amount);
		sale.setQty(qty);
        // Specify properties to ignore 
		var matcher = ExampleMatcher.matchingAny()
								    .withIgnorePaths("invno", "transdate", "product");

		for (var s : salesRepo.findAll(Example.of(sale)))
			System.out.println(s);
	}

	@Override
	public void run(String... args) throws Exception {
		// Print first page of Sales
//	   for(var s : salesRepo.findAll(PageRequest.of(0,5)))
//	   {
//		   System.out.println(s);
//	   }

//	   for(var s : salesRepo.findAll(PageRequest.of(0,5, Sort.by("amount").descending())))
//	   {
//		   System.out.println(s);
//	   }

		printSales(3, 8000);
	}
}
