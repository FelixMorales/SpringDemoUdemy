package com.hibernateTutorial.persistence.dao;

import com.hibernateTutorial.common.EntityFactory;
import com.hibernateTutorial.common.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo
{
    public static void main(String [] args)
    {
        SessionFactory sessionFactory = new Configuration(  )
                                            .configure()
                                            .addAnnotatedClass( Student.class )
                                            .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        Student student = EntityFactory.createStudent();
        student.setFirstName( "Felix" );
        student.setLastName( "Morales" );
        student.setEmail( "felixmorales747@gmail.com" );

        try
        {
            session.beginTransaction();
            session.save( student );
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
