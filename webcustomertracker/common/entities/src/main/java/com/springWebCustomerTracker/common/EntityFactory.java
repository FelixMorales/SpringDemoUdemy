package com.springWebCustomerTracker.common;


import com.springWebCustomerTracker.common.entities.Customer;

public class EntityFactory
{
    public static Customer createCustomer(){
        return new Customer();
    }
}
