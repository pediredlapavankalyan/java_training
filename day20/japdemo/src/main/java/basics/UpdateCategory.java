package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateCategory {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		var category = em.find(Category.class, "c10"); // 1
		// Managed
		if (category != null) {
			category.setDescription("New Category 10"); // 2
			em.getTransaction().begin(); // 3
			em.getTransaction().commit(); // 4
		} else
			System.out.println("Sorry! Category code not found!");
		em.close();
		emf.close();

	}

}
