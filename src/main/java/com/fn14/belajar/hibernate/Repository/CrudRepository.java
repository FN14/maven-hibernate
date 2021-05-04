/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.belajar.hibernate.Repository;

import org.hibernate.HibernateException;

/**
 *
 * @author FN14
 */
public interface CrudRepository<T, PK> extends ReadRepository<T, PK> {
    
    T Save(T value) throws HibernateException;
    T Update(T value) throws HibernateException;
    boolean removeById(PK value) throws HibernateException;
}
