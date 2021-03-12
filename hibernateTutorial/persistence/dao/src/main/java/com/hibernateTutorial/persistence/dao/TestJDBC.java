package com.hibernateTutorial.persistence.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC
{
    public static void main(String [] args)
    {
        String jdbc = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
        String user = "hbstudent";
        String pw = "hbstudent";

        try
        {
            Connection conn = DriverManager.getConnection( jdbc, user, pw );
            System.out.println( "Connection open: "+jdbc );
            conn.close();
            System.out.println( "Connection closed" );
        }
        catch ( Exception e )
        {
            System.out.println( e.toString() );
        }

    }
}
