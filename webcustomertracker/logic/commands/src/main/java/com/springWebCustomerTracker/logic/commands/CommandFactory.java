package com.springWebCustomerTracker.logic.commands;

import com.springWebCustomerTracker.common.entities.Customer;
import com.springWebCustomerTracker.logic.commands.customers.AddCustomerCommand;
import com.springWebCustomerTracker.logic.commands.customers.GetCustomersCommand;
import com.springWebCustomerTracker.persistence.dao.interfaces.ICustomerDAO;

public class CommandFactory
{
    public static GetCustomersCommand createGetCustomersCommand( ICustomerDAO dao ){

        return new GetCustomersCommand( dao );
    }

    public static AddCustomerCommand createAddCustomerCommand( ICustomerDAO dao, Customer customer ){
        return new AddCustomerCommand( dao, customer );
    }
}
