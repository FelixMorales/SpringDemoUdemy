package com.springWebCustomerTracker.persistence.dao.interfaces;

import com.springWebCustomerTracker.common.entities.Customer;

import java.util.List;

public interface ICustomerDAO extends IBaseDAO<Customer>
{
    List<Customer> getCustomersOrderedByLastName();
}
