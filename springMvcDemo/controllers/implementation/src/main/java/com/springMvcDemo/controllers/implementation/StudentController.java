package com.springMvcDemo.controllers.implementation;

import com.springMvcDemo.common.models.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController
{
    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @Value("#{languageOptions}")
    private Map<String, String> languageOptions;

    @RequestMapping("/showForm")
    public String showForm( Model model )
    {
        Student student = new Student();
        model.addAttribute( "student", student );
        model.addAttribute( "countriesList", countryOptions );
        model.addAttribute( "languageList", languageOptions );

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm( @ModelAttribute("student") Student student )
    {
        System.out.println( "Student:" + student.getFirstName() + " - " + student.getLastName() );
        System.out.println( "Student Country:" + student.getCountry() );
        System.out.println( "Student Language:" + student.getFavoriteLanguage() );

        return "student-confirmation";
    }
}
