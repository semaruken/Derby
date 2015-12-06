package com.vektorel.semaruken.derby.service;

import com.vektorel.semaruken.derby.entity.Skart;
import java.util.List;

/**
 *
 * @author sema
 */
public interface TServiceBase<T> {

    public T save(T entity);

    public T update(T entity);

    public boolean delete(T entity);

    public List<T> getAll();
    
    
    public T getById(Long entity);
}
