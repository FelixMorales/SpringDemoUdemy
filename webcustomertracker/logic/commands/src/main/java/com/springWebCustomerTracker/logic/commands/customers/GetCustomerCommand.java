package com.springWebCustomerTracker.logic.commands.customers;

import com.springWebCustomerTracker.common.entities.Customer;
import com.springWebCustomerTracker.logic.commands.BaseCommand;
import com.springWebCustomerTracker.persistence.dao.interfaces.ICustomerDAO;

public class GetCustomerCommand extends BaseCommand<Customer>
{
    private ICustomerDAO _customerDAO;
    private Customer _result;
    private int _id;

    public GetCustomerCommand( ICustomerDAO customerDAO, int id )
    {
        _customerDAO = customerDAO;
        _id = id;
    }

    @Override
    public void execute()
    {
        _result = _customerDAO.find( _id );
    }

    @Override
    public Customer getReturnParams()
    {
        return _result;
    }
}
