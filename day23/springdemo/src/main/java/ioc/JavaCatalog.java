package ioc;

import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope(scopeName="prototype")
public class JavaCatalog implements Catalog {

	public JavaCatalog() {
	    System.out.println("JavaCatalog()");
	}
	@Override
	public List<String> getBooks() {
		return List.of("Java Complete Reference", "Java Persistence with Hibernate");
	}

}
