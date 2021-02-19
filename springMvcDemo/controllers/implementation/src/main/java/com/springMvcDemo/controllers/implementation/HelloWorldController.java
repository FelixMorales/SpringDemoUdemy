package com.springMvcDemo.controllers.implementation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController
{

    @RequestMapping("/showForm")
    public String showForm()
    {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String showProcessForm()
    {
        return "helloworld";
    }

    @RequestMapping("/processFormTwo")
    public String processFormTwo( HttpServletRequest request, Model model )
    {
        String name = request.getParameter( "studentName" );

        name = name.toUpperCase();

        String result = "Yo! " + name;

        model.addAttribute( "message", result );

        return "helloworld";
    }
}
