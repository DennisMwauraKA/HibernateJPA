package com.dennis.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        // Create the StudentName object and set its fields
        StudentName sn = new StudentName();
        sn.setfName("Dennis");
        sn.setMiddleName("Mawaura");
        sn.setSurName("Kariuki");

        // Create the Student object and set its fields
        Student stud = new Student();
        stud.setColor("Blue");
        stud.setName(sn);
        stud.setId(1081);

        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        // Save the student to the database
        session.persist(stud);
        tx.commit(); // Commit the transaction to save data

        // Open a new session to retrieve data
        session = sf.openSession();
        tx = session.beginTransaction();

        
        Student retrievedStudent = (Student) session.get(Student.class, 1081);
        tx.commit();

        System.out.println("Retrieved Student: " + retrievedStudent);

        
        session.close();
        sf.close();
    }
}
