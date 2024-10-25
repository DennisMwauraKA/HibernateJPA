package com.dennis.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Student stud = new Student();
    	stud.setColor("Blue");
    	stud.setName("Dennis");
    	stud.setId(109);
    	System.out.println( "Hello World!" );
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    	SessionFactory sf= con.buildSessionFactory();
 
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.persist(stud);
    	
    	tx.commit();
    }
}
