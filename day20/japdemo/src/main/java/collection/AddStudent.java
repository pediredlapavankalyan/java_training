package collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();
		
		Student s = new Student();
		s.setName("James");
		
		s.getExams().add( new Examination("Java", 80));
		s.getExams().add( new Examination("Spring", 85));
		
		em.getTransaction().begin(); 
		em.persist(s);
	    em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
