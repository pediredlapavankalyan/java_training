package onetomany.pubs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListPublishers {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		var pubs = em.createQuery("from onetomany.pubs.Publisher", Publisher.class).getResultList();

		for (var p : pubs) {
			var titles = p.getTitles();
			if (titles.size() == 0) // no titles found
				continue;

			System.out.printf("%s  %s\n", p.getId(), p.getName());
			double total = 0;
			for (var t : titles) {
				double price = t.getPrice() == null ? 0 : t.getPrice().doubleValue();

				System.out.printf("%-80s %8.2f\n", t.getTitle(), price);
				total += price;
			}
			System.out.printf("Total = %8.2f\n", total);
		}

		em.close();
		emf.close();
	}
}
