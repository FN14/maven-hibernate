/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.belajar.hibernate.Dao;

import com.fn14.belajar.hibernate.Entity.Mahasiswa;
import com.fn14.belajar.hibernate.Repository.CrudRepository;
import java.util.List;
import java.util.Optional;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author FN14
 */
public class MahasiswaDao implements CrudRepository<Mahasiswa,Long> {

    private Session session;

    public MahasiswaDao(Session session) {
        this.session = session;
    }
      
    @Override
    public Mahasiswa Save(Mahasiswa value) throws HibernateException {
        Long returnKey = (Long)this.session.save(value);
        value.setKode(returnKey);
        return value;
    }

    @Override
    public Mahasiswa Update(Mahasiswa value) throws HibernateException {
        this.session.update(value);
        return value;
    }

    @Override
    public boolean removeById(Long value) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean removeBy(Mahasiswa value) throws HibernateException {
        this.session.remove(value);
        return true;
    }

    @Override
    public Optional<Mahasiswa> findById(Long value) {
        Mahasiswa mhs = this.session.find(Mahasiswa.class, value);
        return (Optional<Mahasiswa>) (mhs != null ? Optional.of(mhs) : Optional.empty());
    }

    @Override
    public List<Mahasiswa> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
