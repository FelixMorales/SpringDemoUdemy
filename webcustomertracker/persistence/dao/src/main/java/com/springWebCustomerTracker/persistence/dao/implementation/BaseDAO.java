package com.springWebCustomerTracker.persistence.dao.implementation;

import javax.persistence.EntityManager;

import com.springWebCustomerTracker.common.exceptions.jpa.AddException;
import com.springWebCustomerTracker.common.exceptions.jpa.ConstraintException;
import com.springWebCustomerTracker.common.exceptions.jpa.DeleteException;
import com.springWebCustomerTracker.common.exceptions.jpa.FindAllException;
import com.springWebCustomerTracker.common.exceptions.jpa.FindException;
import com.springWebCustomerTracker.common.exceptions.jpa.UpdateException;
import com.springWebCustomerTracker.persistence.dao.interfaces.IBaseDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.PersistenceException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class BaseDAO<T> implements IBaseDAO<T>
{
    @Autowired
    private SessionFactory _sessionFactory;

    private Class<T> _class;

    public BaseDAO()
    {
        _class = (Class<T>) ( ( ParameterizedType ) getClass().getGenericSuperclass() ).getActualTypeArguments()[ 0 ];
    }

    protected SessionFactory getSessionFactory()
    {
        return _sessionFactory;
    }

    /**
     * Name: insert
     * Description: method to insert entity into the DB.
     *
     * @param entity entity
     */
    @Override
    public T insert( T entity )
    {

        EntityManager em = _sessionFactory.getCurrentSession();

        try
        {
            em.persist( entity );
            em.flush();
        }
        catch ( PersistenceException | IllegalStateException e )
        {
            throw new ConstraintException( e, e.getMessage() );
        }
        catch ( Exception e )
        {
            throw new AddException( e, e.getMessage() );
        }

        return entity;
    }

    /**
     * Name: update
     * Description: method to update entity into the DB.
     *
     * @param entity entity
     */
    public T update( T entity )
    {
        EntityManager em = _sessionFactory.getCurrentSession();

        try
        {
            em.merge( entity );
            em.flush();
        }
        catch ( PersistenceException | IllegalStateException e )
        {
            throw new ConstraintException( e, e.getMessage() );
        }
        catch ( Exception e )
        {
            throw new UpdateException( e, e.getMessage() );
        }

        return entity;
    }

    /**
     * Name: delete
     * Description: method to delete entity from the DB.
     *
     * @param entity entity
     */
    public T delete( T entity )
    {
        EntityManager em = _sessionFactory.getCurrentSession();

        try
        {
            em.remove( entity );
            em.flush();
        }
        catch ( Exception e )
        {
            throw new DeleteException( e, e.getMessage() );
        }

        return entity;
    }

    /**
     * Name: findAll
     * Description: method to get all entities from the DB.
     *
     * @return entity list
     */
    public List<T> findAll()
    {
        List<T> list = null;

        final CriteriaQuery<T> criteriaQuery;
        final Root<T> root;

        EntityManager em = _sessionFactory.getCurrentSession();

        try
        {
            criteriaQuery = em.getCriteriaBuilder().createQuery( _class );

            root = criteriaQuery.from( _class );
            criteriaQuery.select( root );

            list = em.createQuery( criteriaQuery ).getResultList();
        }
        catch ( Exception e )
        {
            throw new FindAllException( e, e.getMessage() );
        }

        return list;
    }

    /**
     * Name: find
     * Description: method to get the specific entity by id from the DB.
     *
     * @param id identifier
     */
    public T find( int id )
    {
        T result = null;

        try
        {
            result = _sessionFactory.getCurrentSession().find( _class, id );
        }
        catch ( Exception e )
        {
            throw new FindException( e, e.getMessage() );
        }

        return result;
    }

}
