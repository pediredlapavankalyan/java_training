package manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddAuthorTitles {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

	    Author a = new Author();
	    a.setName("New Author");
	    a.setId("233");

	    Title t = new Title();
	    t.setTitle("New Title");
	    t.setId("333");
	    
	    a.getTitles().add(t);
	    t.getAuthors().add(a);
	 
	    em.getTransaction().begin();
	    em.persist(t);
	    em.persist(a);
	    em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
