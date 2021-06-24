package com.springWebCustomerTracker.common.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer extends BaseEntity
{
    @Column(name = "first_name")
    private  String _firstName;

    @Column(name = "last_name")
    private String _lastName;

    @Column(name = "email")
    private String _email;

    public String getFirstName()
    {

        return _firstName;
    }

    public void setFirstName( String firstName )
    {
        _firstName = firstName;
    }

    public String getLastName()
    {
        return _lastName;
    }

    public void setLastName( String lastName )
    {
        _lastName = lastName;
    }

    public String getEmail()
    {
        return _email;
    }

    public void setEmail( String email )
    {
        _email = email;
    }
}

