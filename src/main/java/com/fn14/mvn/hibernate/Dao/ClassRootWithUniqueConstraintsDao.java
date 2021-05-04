/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate.Dao;

import com.fn14.mvn.hibernate.Entity.ClassRootWithUniqueConstraints;
import com.fn14.mvn.hibernate.Repository.CrudRepository;
import java.util.List;
import java.util.Optional;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author FN14
 */
public class ClassRootWithUniqueConstraintsDao implements CrudRepository<ClassRootWithUniqueConstraints,String>{

    
    private Session session;

    public ClassRootWithUniqueConstraintsDao(Session session) {
        this.session = session;
    }
    
    
    @Override
    public ClassRootWithUniqueConstraints Save(ClassRootWithUniqueConstraints value) throws HibernateException {
        String resKey = (String) this.session.save(value);
        value.setId(resKey);
        return value;
    }

    @Override
    public ClassRootWithUniqueConstraints Update(ClassRootWithUniqueConstraints value) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeById(String value) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<ClassRootWithUniqueConstraints> findById(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ClassRootWithUniqueConstraints> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
    
    
    
    
    
}
