package com.springMvcDemo.common.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer
{
    private String _firstName;

    @NotNull()
    @Size( min = 5, message = "is required")
    private  String _lastName;

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
}
