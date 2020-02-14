package com.iiht.bt2.HibernateApp1;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Session session = new AnnotationConfiguration().configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
					
		/*Person p1 = new Person(); 
		  //p1.setPid(101);
		  p1.setPnane("dinuuu");
		  p1.setAge(26);
		  session.save(p1);		
		  
		  Person p2 = new Person(); 
		  p2.setPnane("amir");
		  p2.setAge(420);
		  session.save(p2);	
		  
			/*Query query = session.createQuery(hql);
			query.setParameter("sid", 1);
			int re = query.executeUpdate();
			System.out.println("Delete resl :"+re);	*/
		  //////
		 /* String hql = "DELETE FROM Person WHERE id = :pid";
			Query query = session.createQuery(hql);
			query.setParameter("pid", 6);
			int re = query.executeUpdate();
			System.out.println("Delete resl :"+re);	
			///////from
			String hql1 = "from Person";
			Query query1 = session.createQuery(hql1);
			List list = query1.list();
			for (int i = 0; i < list.size(); i++) {
				Person s = (Person)list.get(i);
				System.out.println(s.getPid()+","+s.getPnane());
			}
			*/
		////////select
			String hql2 = "select pname from Person";
			Query query2 = session.createQuery(hql2);
			List list1 = query2.list();
			for (int i = 0; i < list1.size(); i++) {
				String name = (String)list1.get(i);
				System.out.println("Name :"+name);
			}

			
		  transaction.commit();
		
		session.close();
		System.out.println("annot done ...");
    }
}