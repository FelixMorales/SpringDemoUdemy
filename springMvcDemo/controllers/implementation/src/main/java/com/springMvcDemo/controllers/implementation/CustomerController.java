package com.springMvcDemo.controllers.implementation;

import com.springMvcDemo.common.models.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController
{
    @InitBinder
    public void initBinder( WebDataBinder dataBinder) {

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor( true);

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/showForm")
    public String showForm( Model model )
    {
        model.addAttribute( "customer", new Customer() );

        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm( @Valid @ModelAttribute("customer") Customer customer,
            BindingResult bindingResult )
    {
        System.out.println("Customer: "+customer.toString());

        if (bindingResult.hasErrors()) {

            for( ObjectError error : bindingResult.getAllErrors() )
            {
                System.out.println( error.toString() );
            }

            return "customer-form";
        }

        return "customer-confirmation";
    }
}
