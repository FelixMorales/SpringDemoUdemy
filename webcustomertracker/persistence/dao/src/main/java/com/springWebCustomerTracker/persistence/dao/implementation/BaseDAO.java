package com.springWebCustomerTracker.persistence.dao.implementation;

import javax.persistence.EntityManager;

import com.springWebCustomerTracker.common.exceptions.jpa.FindAllException;
import com.springWebCustomerTracker.persistence.dao.interfaces.IBaseDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

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

        //TODO: insert implementation

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
        //TODO: update implementation

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
        //TODO: delete implementation

        return entity;
    }

    /**
     * Name: findAll
     * Description: method to get all entities from the DB.
     *
     * @return entity list
     */
    @Transactional
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
     * Description: method to get the specific entity from the DB.
     *
     * @param id identifier
     */
    public T find( int id )
    {
        T result = null;

        //TODO: find implementation

        return result;
    }

}