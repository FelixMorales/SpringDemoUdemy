package com.springWebCustomerTracker.persistence.dao;

import java.sql.*;

public class Testdb
{
    public void TestConnection() throws SQLException
    {
        // TODO: Move to config file
        String user = "root";
        String pw = "djrex747";
        String sqlString = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";

        try
        {
            Connection conn = DriverManager.getConnection( sqlString, user, pw );
            conn.close();
        }
        catch ( Exception  e )
        {
            e.printStackTrace();
            throw e;
        }

    }
}
