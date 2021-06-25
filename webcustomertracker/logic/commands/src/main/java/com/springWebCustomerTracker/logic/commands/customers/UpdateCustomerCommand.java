package com.springWebCustomerTracker.logic.commands.customers;

import com.springWebCustomerTracker.common.entities.Customer;
import com.springWebCustomerTracker.logic.commands.BaseCommand;
import com.springWebCustomerTracker.persistence.dao.interfaces.ICustomerDAO;

public class UpdateCustomerCommand extends BaseCommand<Customer>
{
    private Customer _customer;
    private ICustomerDAO _customerDAO;

    public UpdateCustomerCommand( ICustomerDAO customerDAO, Customer customer )
    {
        _customerDAO = customerDAO;
        _customer = customer;
    }

    @Override
    public void execute()
    {
        _customer = _customerDAO.update( _customer );
    }

    @Override
    public Customer getReturnParams()
    {
        return _customer;
    }
}
