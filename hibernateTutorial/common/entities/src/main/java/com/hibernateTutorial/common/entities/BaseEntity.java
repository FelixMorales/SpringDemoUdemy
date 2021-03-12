package com.hibernateTutorial.common.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity
{
    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long _id;

    public long getId()
    {
        return _id;
    }

    public void setId( long id )
    {
        _id = id;
    }

    public BaseEntity(){}

    public BaseEntity(long id)
    {
        _id = id;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder( "BaseEntity{" );
        sb.append( "_id=" ).append( _id );
        sb.append( '}' );
        return sb.toString();
    }
}
