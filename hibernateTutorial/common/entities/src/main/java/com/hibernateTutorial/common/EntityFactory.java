package com.hibernateTutorial.common;

import com.hibernateTutorial.common.entities.Student;

public class EntityFactory
{
    public static Student createStudent()
    {
        return new Student(  );
    }
}
