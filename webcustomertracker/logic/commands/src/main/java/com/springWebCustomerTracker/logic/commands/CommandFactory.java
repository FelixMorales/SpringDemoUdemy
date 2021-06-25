package com.springWebCustomerTracker.logic.commands;

import com.springWebCustomerTracker.common.entities.Customer;
import com.springWebCustomerTracker.logic.commands.customers.AddCustomerCommand;
import com.springWebCustomerTracker.logic.commands.customers.DeleteCustomerCommand;
import com.springWebCustomerTracker.logic.commands.customers.GetCustomerCommand;
import com.springWebCustomerTracker.logic.commands.customers.GetCustomersCommand;
import com.springWebCustomerTracker.logic.commands.customers.UpdateCustomerCommand;
import com.springWebCustomerTracker.persistence.dao.interfaces.ICustomerDAO;

public class CommandFactory
{
    public static GetCustomersCommand createGetCustomersCommand( ICustomerDAO dao ){

        return new GetCustomersCommand( dao );
    }

    public static AddCustomerCommand createAddCustomerCommand( ICustomerDAO dao, Customer customer ){
        return new AddCustomerCommand( dao, customer );
    }

    public static GetCustomerCommand createGetCustomerCommand( ICustomerDAO dao, int id ){
        return new GetCustomerCommand( dao, id );
    }

    public static UpdateCustomerCommand createUpdateCustomerCommand( ICustomerDAO dao, Customer customer ){
        return new UpdateCustomerCommand( dao, customer );
    }

    public static DeleteCustomerCommand createDeleteCustomerCommand( ICustomerDAO dao, Customer customer ){
        return new DeleteCustomerCommand( dao, customer );
    }
}
