package com.springWebCustomerTracker.logic.commands.customers;

import com.springWebCustomerTracker.common.entities.Customer;
import com.springWebCustomerTracker.logic.commands.BaseCommand;
import com.springWebCustomerTracker.persistence.dao.interfaces.ICustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GetCustomersCommand extends BaseCommand<List<Customer>>
{
    private ICustomerDAO _customerDAO;
    private List<Customer> _customers;

    @Autowired
    private void setCustomerDAO( ICustomerDAO dao ){
        _customerDAO = dao;
    }

    @Override
    @Transactional
    public void execute()
    {
        _customers = _customerDAO.findAll();
    }

    @Override
    public List<Customer> getReturnParams()
    {
        return _customers;
    }
}
