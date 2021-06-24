package com.springWebCustomerTracker.persistence.dao.interfaces;

import com.springWebCustomerTracker.common.entities.Customer;

import java.util.List;

public interface IBaseDAO<T>
{
    T insert( T entity );

    T update( T update );

    List<T> findAll();

    T find( int id );
}
