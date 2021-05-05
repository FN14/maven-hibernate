/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate.Dao;

import com.fn14.mvn.hibernate.Entity.ClassSeqGen;
import com.fn14.mvn.hibernate.Entity.ClassUuidGen;
import com.fn14.mvn.hibernate.Repository.CrudRepository;
import java.util.List;
import java.util.Optional;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author FN14
 */
public class ClassUuidGenDao implements CrudRepository<ClassUuidGen,String> {
    
    private Session session;
    
    public ClassUuidGenDao(Session session){
        this.session = session; 
    }

    @Override
    public ClassUuidGen Save(ClassUuidGen value) throws HibernateException {
        String priKey = (String) this.session.save(value);
        value.setId(priKey);
        return value;
    }

    @Override
    public ClassUuidGen Update(ClassUuidGen value) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeById(String value) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<ClassUuidGen> findById(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ClassUuidGen> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
    
}
