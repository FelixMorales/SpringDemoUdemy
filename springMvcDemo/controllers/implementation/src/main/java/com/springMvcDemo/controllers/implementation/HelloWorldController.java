package com.springMvcDemo.controllers.implementation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController
{

    @RequestMapping("/showForm")
    public String showForm()
    {
        return "helloworld-form";
    }

    // Version 1
    @RequestMapping("/processForm")
    public String showProcessForm()
    {
        return "helloworld";
    }

    // Version 2
    @RequestMapping("/processFormTwo")
    public String processFormTwo( HttpServletRequest request, Model model )
    {
        String name = request.getParameter( "studentName" );

        name = name.toUpperCase();

        String result = "Yo! " + name;

        model.addAttribute( "message", result );

        return "helloworld";
    }

    // Version 3
    @RequestMapping("/processFormThree")
    public String processFormThree( @RequestParam("studentName") String name, Model model )
    {
        name = name.toUpperCase();

        String result = "Hey hey! " + name;

        model.addAttribute( "message", result );

        return "helloworld";
    }
}
