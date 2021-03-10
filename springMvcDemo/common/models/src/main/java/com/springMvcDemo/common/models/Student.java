package com.springMvcDemo.common.models;

import java.util.List;

public class Student
{
    private String _firstName;
    private String _lastName;
    private String _country;
    private String _favoriteLanguage;
    private List<String> _operatingSystems;

    public Student()
    {
    }

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

    public String getCountry()
    {
        return _country;
    }

    public void setCountry( String country )
    {
        _country = country;
    }

    public String getFavoriteLanguage()
    {
        return _favoriteLanguage;
    }

    public void setFavoriteLanguage( String favoriteLanguage )
    {
        _favoriteLanguage = favoriteLanguage;
    }

    public List<String> getOperatingSystems()
    {
        return _operatingSystems;
    }

    public void setOperatingSystems( List<String> operatingSystems )
    {
        _operatingSystems = operatingSystems;
    }
}
