package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddProduct {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		Product p = new Product();
		p.setName("New Product");
		p.setPrice(1000);
		p.setQoh(10);
		p.setCategory("pr");
		
	    em.getTransaction().begin();
		em.persist(p); // insert c into table 
		em.getTransaction().commit();

		em.close();
	    emf.close();

	}

}
