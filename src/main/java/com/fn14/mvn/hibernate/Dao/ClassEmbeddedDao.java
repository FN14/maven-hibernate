/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate.Dao;

import com.fn14.mvn.hibernate.Entity.ClassEmbedded;
import com.fn14.mvn.hibernate.Entity.ClassEmbedebleId;
import com.fn14.mvn.hibernate.Repository.CrudRepository;
import java.util.List;
import java.util.Optional;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author FN14
 */
public class ClassEmbeddedDao implements CrudRepository<ClassEmbedded, ClassEmbedebleId> {

    private Session session;

    public ClassEmbeddedDao(Session session) {
        this.session = session;
    }
    
    
    @Override
    public ClassEmbedded Save(ClassEmbedded value) throws HibernateException {
        ClassEmbedebleId classEmbId = (ClassEmbedebleId) this.session.save(value);
        value.setId(classEmbId);
        return value;
    }

    @Override
    public ClassEmbedded Update(ClassEmbedded value) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeById(ClassEmbedebleId value) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<ClassEmbedded> findById(ClassEmbedebleId value) {
        ClassEmbedded classEmb = this.session.find(ClassEmbedded.class, value);
        return (Optional<ClassEmbedded>) (classEmb != null ? Optional.of(classEmb) : Optional.empty());
    }

    @Override
    public List<ClassEmbedded> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
