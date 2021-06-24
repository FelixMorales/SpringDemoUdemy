package com.springWebCustomerTracker.webapp.implementation;

import com.springWebCustomerTracker.common.entities.Customer;
import com.springWebCustomerTracker.logic.commands.customers.GetCustomersCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController
{

    private GetCustomersCommand _getCustomersCommand;

    @Autowired
    public void setGetCustomersCommand( GetCustomersCommand command ){
        _getCustomersCommand = command;
    }

    @RequestMapping("/list")
    public String listCustomers( Model model ){

        _getCustomersCommand.execute();

        List<Customer> customers = _getCustomersCommand.getReturnParams();

        model.addAttribute( "customers", customers );

        return "list-customers";
    }

}
