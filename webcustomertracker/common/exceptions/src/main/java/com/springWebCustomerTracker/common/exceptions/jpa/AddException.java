package com.springWebCustomerTracker.common.exceptions.jpa;

import com.springWebCustomerTracker.common.exceptions.BaseException;

/**
 * Name: AddException
 * Description: Excepcion que se genera debido a un error inesperado al insertar une entidad en la base de datos
 */
public class AddException extends BaseException
{
    public AddException( Exception e, String str )
    {
        super( e, str );
    }
}
