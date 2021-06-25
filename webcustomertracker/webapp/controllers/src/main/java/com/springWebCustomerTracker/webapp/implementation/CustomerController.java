package com.springWebCustomerTracker.webapp.implementation;

import com.springWebCustomerTracker.common.EntityFactory;
import com.springWebCustomerTracker.common.entities.Customer;
import com.springWebCustomerTracker.logic.commands.customers.AddCustomerCommand;
import com.springWebCustomerTracker.logic.commands.customers.GetCustomersCommand;
import com.springWebCustomerTracker.logic.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController
{

    private CustomerService _customerService;

    @Autowired
    private void setCustomerService( CustomerService service ){
        _customerService = service;
    }

    @GetMapping("/list")
    public String listCustomers( Model model ){

        List<Customer> customers = _customerService.getCustomers();

        model.addAttribute( "customers", customers );

        return "list-customers";
    }

    @GetMapping("/showFormAdd")
    public String showFormAdd( Model model ){

        Customer customer = EntityFactory.createCustomer();

        model.addAttribute( "customer", customer );

        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer( @ModelAttribute("customer") Customer customer ){

        _customerService.addCustomer( customer );

        return "redirect:/customer/list";
    }

}
