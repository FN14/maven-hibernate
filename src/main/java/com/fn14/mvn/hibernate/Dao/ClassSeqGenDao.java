/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate.Dao;

import com.fn14.mvn.hibernate.Entity.ClassSeqGen;
import com.fn14.mvn.hibernate.Repository.CrudRepository;
import java.util.List;
import java.util.Optional;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author FN14
 */
public class ClassSeqGenDao implements CrudRepository<ClassSeqGen,Long> {
    
    private Session session;
    
    public ClassSeqGenDao(Session session){
        this.session = session; 
    }

    @Override
    public ClassSeqGen Save(ClassSeqGen value) throws HibernateException {
        Long priKey = (Long)this.session.save(value);
        value.setId(priKey);
        return value;
    }

    @Override
    public ClassSeqGen Update(ClassSeqGen value) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeById(Long value) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<ClassSeqGen> findById(Long value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ClassSeqGen> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
