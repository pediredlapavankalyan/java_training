package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListCategories {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory
				                      ("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from Category", Category.class);  // JPQL
		var categories = query.getResultList();

		//System.out.println("Count = " + categories.size());
		
		for (var cat : categories) {
			System.out.println(cat.getCode() + " - " + cat.getDescription());
		}

		em.close();
		emf.close();

	}

}
