package com.springMvcDemo.common.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer
{
    private String _firstName;

    @NotNull()
    @Size( min = 5, message = "is required")
    private  String _lastName;

    @NotNull(message = "is required")
    @Min( value = 0, message = "must be greater than or equal to zero")
    @Max( value =  10, message = "must be lower than or equal to 10.")
    private Integer _freePasses;

    @Pattern( regexp = "^[a-zA-Z0-9{5}]", message = "invalid input")
    private String _postalCode;

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

    public Integer getFreePasses()
    {
        return _freePasses;
    }

    public void setFreePasses( Integer freePasses )
    {
        _freePasses = freePasses;
    }

    public String getPostalCode()
    {
        return _postalCode;
    }

    public void setPostalCode( String postalCode )
    {
        _postalCode = postalCode;
    }

    @Override
    public String toString()
    {
        return "Customer{" + "_firstName='" + _firstName + '\'' + ", _lastName='" + _lastName + '\'' +
               ", _freePasses=" + _freePasses + ", _postalCode='" + _postalCode + '\'' + '}';
    }
}
