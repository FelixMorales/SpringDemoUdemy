package com.springWebCustomerTracker.logic.commands.customers;

import com.springWebCustomerTracker.common.entities.Customer;
import com.springWebCustomerTracker.logic.commands.BaseCommand;
import com.springWebCustomerTracker.persistence.dao.interfaces.ICustomerDAO;

import java.util.List;

public class GetCustomersCommand extends BaseCommand<List<Customer>>
{
    private ICustomerDAO _customerDAO;
    private List<Customer> _customers;

    public GetCustomersCommand( ICustomerDAO dao ){
        _customerDAO = dao;
    }

    @Override
    public void execute()
    {
        _customers = _customerDAO.getCustomersOrderedByLastName();
    }

    @Override
    public List<Customer> getReturnParams()
    {
        return _customers;
    }
}
