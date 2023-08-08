package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddCategory {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		Category c = new Category();
		c.setCode("cat100");
		c.setDescription("Category 100");
		// Transient

		em.getTransaction().begin();
		em.persist(c); // insert c into table 
		// Managed
		em.getTransaction().commit();

		em.close();
		// Detached
		emf.close();

	}

}
