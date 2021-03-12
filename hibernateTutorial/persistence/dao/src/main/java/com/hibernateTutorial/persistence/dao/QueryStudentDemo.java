package com.hibernateTutorial.persistence.dao;

import com.hibernateTutorial.common.EntityFactory;
import com.hibernateTutorial.common.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo
{
    public static void main(String [] args)
    {
        SessionFactory sessionFactory = new Configuration(  )
                                            .configure()
                                            .addAnnotatedClass( Student.class )
                                            .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        List<Student> students;
        try
        {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            students = session.createQuery( "from Student" ).getResultList();
            session.getTransaction().commit();
            session.close();

            for( Student student : students )
            {
                System.out.println( student.toString() );
            }
        }
        finally
        {
            sessionFactory.close();
        }





    }
}
