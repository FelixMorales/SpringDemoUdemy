package com.springWebCustomerTracker.logic.commands;

public abstract class BaseCommand<T>
{
    public abstract void execute();

    public abstract T getReturnParams();
}
