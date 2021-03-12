package com.hibernateTutorial.persistence.dao;

import com.hibernateTutorial.common.EntityFactory;
import com.hibernateTutorial.common.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo
{
    public static void main(String [] args)
    {
        SessionFactory sessionFactory = new Configuration(  )
                                            .configure()
                                            .addAnnotatedClass( Student.class )
                                            .buildSessionFactory();
        try
        {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Student student = session.get( Student.class, EntityFactory.createStudent( 2 ).getId() );
            session.delete( student );
            session.getTransaction().commit();
            session.close();

            System.out.println( student );
        }
        finally
        {
            sessionFactory.close();
        }





    }
}
