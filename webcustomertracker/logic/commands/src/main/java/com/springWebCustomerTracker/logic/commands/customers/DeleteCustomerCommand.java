package com.springWebCustomerTracker.logic.commands.customers;

import com.springWebCustomerTracker.common.entities.Customer;
import com.springWebCustomerTracker.logic.commands.BaseCommand;
import com.springWebCustomerTracker.persistence.dao.interfaces.ICustomerDAO;

public class DeleteCustomerCommand extends BaseCommand<Boolean>
{
    private Customer _customer;
    private ICustomerDAO _customerDAO;

    public DeleteCustomerCommand( ICustomerDAO customerDAO, Customer customer )
    {
        _customerDAO = customerDAO;
        _customer = customer;
    }

    @Override
    public void execute()
    {
        _customerDAO.delete( _customer );
    }

    @Override
    public Boolean getReturnParams()
    {
        return true;
    }
}
