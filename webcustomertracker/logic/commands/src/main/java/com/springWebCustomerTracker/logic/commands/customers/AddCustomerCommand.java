package com.springWebCustomerTracker.logic.commands.customers;

import com.springWebCustomerTracker.common.entities.Customer;
import com.springWebCustomerTracker.logic.commands.BaseCommand;
import com.springWebCustomerTracker.persistence.dao.interfaces.ICustomerDAO;

public class AddCustomerCommand extends BaseCommand<Customer>
{
    private ICustomerDAO _customerDAO;
    private Customer _customer;

    public AddCustomerCommand( ICustomerDAO dao, Customer customer){
        _customer = customer;
        _customerDAO = dao;
    }

    @Override
    public void execute()
    {
        _customer = _customerDAO.insert( _customer );
    }

    @Override
    public Customer getReturnParams()
    {
        return _customer;
    }
}
