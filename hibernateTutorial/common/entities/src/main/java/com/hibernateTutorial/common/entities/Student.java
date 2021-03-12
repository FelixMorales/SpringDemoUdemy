package com.hibernateTutorial.common.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "student" )
public class Student extends BaseEntity
{
    @Column( name = "first_name" )
    private String _firstName;

    @Column( name = "last_name" )
    private String _lastName;

    @Column( name = "email" )
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

    public Student()
    {
    }

    public Student( long id )
    {
        super(id);
    }

    public Student( String firstName, String lastName, String email )
    {
        _firstName = firstName;
        _lastName = lastName;
        _email = email;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder( "Student{" );
        sb.append( super.toString() );
        sb.append( "_firstName='" ).append( _firstName ).append( '\'' );
        sb.append( ", _lastName='" ).append( _lastName ).append( '\'' );
        sb.append( ", _email='" ).append( _email ).append( '\'' );
        sb.append( '}' );
        return sb.toString();
    }
}
