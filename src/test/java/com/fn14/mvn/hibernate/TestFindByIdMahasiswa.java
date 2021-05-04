/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate;

import com.fn14.mvn.hibernate.Config.HibernateConfiguration;
import com.fn14.mvn.hibernate.Dao.MahasiswaDao;
import com.fn14.mvn.hibernate.Entity.Mahasiswa;
import java.util.Optional;
import junit.framework.TestCase;
import org.hibernate.Session;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author FN14
 */
@Ignore
public class TestFindByIdMahasiswa extends TestCase {
    
    private Session session;
    
    private MahasiswaDao dao;

    @Override
    protected void setUp() throws Exception {
        //log.info("init hibernate session");
        System.out.println("init hibernate session");
        this.session = HibernateConfiguration.getSession();
        this.dao = new MahasiswaDao(session);
    }

    @Test
    public void testFindById() {
//        init value
        this.session.beginTransaction();
//        save data and then return auto generated id
        Long mhsId = 2L;
        Optional<Mahasiswa> mhsOptional = this.dao.findById(mhsId);
        assertTrue("object mahasiswa not null", mhsOptional.isPresent());
        System.out.println("mahasiswa by id: {}" + mhsOptional.orElse(null));

//        commit
     
        //log.info("mahasiswa saved: {}", mahasiswa);
    }

    @Override
    protected void tearDown() throws Exception {
        //log.info("destroy hibernate session!");
        System.out.println("destroy hibernate session!");
        this.session.close();
    }
    
}
