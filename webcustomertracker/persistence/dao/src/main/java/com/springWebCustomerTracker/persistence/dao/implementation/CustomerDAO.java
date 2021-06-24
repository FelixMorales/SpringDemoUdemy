package com.springWebCustomerTracker.persistence.dao.implementation;

import com.springWebCustomerTracker.common.entities.Customer;
import com.springWebCustomerTracker.persistence.dao.interfaces.ICustomerDAO;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO extends BaseDAO<Customer> implements ICustomerDAO
{
    public CustomerDAO(){
        super();
    }
}
