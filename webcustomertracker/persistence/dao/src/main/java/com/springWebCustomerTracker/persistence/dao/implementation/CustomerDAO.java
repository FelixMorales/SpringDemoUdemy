package com.springWebCustomerTracker.persistence.dao.implementation;

import com.springWebCustomerTracker.common.entities.Customer;
import com.springWebCustomerTracker.common.exceptions.jpa.FindAllException;
import com.springWebCustomerTracker.persistence.dao.interfaces.ICustomerDAO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CustomerDAO extends BaseDAO<Customer> implements ICustomerDAO
{
    private EntityManager _em;
    private CriteriaBuilder _builder;

    public CustomerDAO(){
        super();
    }

    /**
     * Get customers list ordered by last name
     * @return customers list
     */
    @Override
    public List<Customer> getCustomersOrderedByLastName(){

        List<Customer> list;

        _em = getSessionFactory().getCurrentSession();
        _builder = _em.getCriteriaBuilder();

        try
        {
            CriteriaQuery<Customer> query = _builder.createQuery( Customer.class );
            Root<Customer> root = query.from( Customer.class );

            query.select( root ).orderBy( _builder.asc( root.get( "_lastName" ) ) );

            list = _em.createQuery( query ).getResultList();
        }
        catch ( Exception e )
        {
            throw new FindAllException( e, e.getMessage() );
        }

        return list;
    }
}
