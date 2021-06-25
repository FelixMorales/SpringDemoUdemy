package com.springWebCustomerTracker.logic.services;

import com.springWebCustomerTracker.common.entities.Customer;
import com.springWebCustomerTracker.logic.commands.BaseCommand;
import com.springWebCustomerTracker.logic.commands.CommandFactory;
import com.springWebCustomerTracker.persistence.dao.interfaces.ICustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerService extends BaseService
{
    private ICustomerDAO _customerDAO;

    @Autowired
    public void setCustomerDAO( ICustomerDAO dao ){
        _customerDAO = dao;
    }

    public List<Customer> getCustomers(){

        BaseCommand<List<Customer>> command = CommandFactory.createGetCustomersCommand( _customerDAO );
        command.execute();

        return command.getReturnParams();
    }

    public Customer addCustomer( Customer customer ){

        BaseCommand<Customer> command = CommandFactory.createAddCustomerCommand( _customerDAO, customer );
        command.execute();

        return command.getReturnParams();
    }
}
