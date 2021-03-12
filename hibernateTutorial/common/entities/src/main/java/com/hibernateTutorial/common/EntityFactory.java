package com.hibernateTutorial.common;

import com.hibernateTutorial.common.entities.Student;

public class EntityFactory
{
    public static Student createStudent()
    {
        return new Student(  );
    }

    public static Student createStudent( long id )
    {
        return new Student( id );
    }

    public static Student createStudent( String firstName, String lastName, String email )
    {
        return new Student( firstName, lastName, email );
    }
}
