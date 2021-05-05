/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate.Dao;

import com.fn14.mvn.hibernate.Entity.ClassForIdClass;
import com.fn14.mvn.hibernate.Entity.ClassForIdClassModel;
import com.fn14.mvn.hibernate.Repository.CrudRepository;
import java.util.List;
import java.util.Optional;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author FN14
 */
public class ClassForIdClassDao implements CrudRepository<ClassForIdClassModel,ClassForIdClass> {

    private Session session;

    public ClassForIdClassDao(Session session) {
        this.session = session;
    }
    
    @Override
    public ClassForIdClassModel Save(ClassForIdClassModel value) throws HibernateException {
        ClassForIdClass classIdClass = (ClassForIdClass) this.session.save(value);
        value.setClassId(classIdClass.getClassId());
        value.setYears(classIdClass.getYears());
        return value;
       
    }

    @Override
    public ClassForIdClassModel Update(ClassForIdClassModel value) throws HibernateException {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeById(ClassForIdClass value) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<ClassForIdClassModel> findById(ClassForIdClass value) {
        ClassForIdClassModel clIdClassMod = this.session.find(ClassForIdClassModel.class, value);
        return (Optional<ClassForIdClassModel>) (clIdClassMod != null ? Optional.of(clIdClassMod) : Optional.empty());
    }

    @Override
    public List<ClassForIdClassModel> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
