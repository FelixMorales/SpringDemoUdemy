package com.springWebCustomerTracker.webapp.implementation;

import com.springWebCustomerTracker.persistence.dao.Testdb;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/testDB")
public class Servlet extends HttpServlet
{

    protected void doGet( HttpServletRequest request, HttpServletResponse response) throws ServletException
    {
        Testdb test = new Testdb();

        try
        {
            PrintWriter out = response.getWriter();
            test.TestConnection();
            out.println( "Connected successfully!" );
        }
        catch ( Exception e )
        {
            throw new ServletException( e );
        }
    }
}