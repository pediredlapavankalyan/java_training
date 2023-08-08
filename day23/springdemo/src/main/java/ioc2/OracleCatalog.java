package ioc2;

import java.util.List;

import org.springframework.stereotype.Component;

import ioc.Catalog;

@Component 
public class OracleCatalog implements Catalog{
  	
	public OracleCatalog() {
	    System.out.println("OracleCatalog()");
	}

	@Override
	public List<String> getBooks() {
	    return List.of("Oracle Complete Reference", "Understanding Oracle");
	}

}
