/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.belajar.hibernate;

import com.fn14.belajar.hibernate.Config.HibernateConfiguration;
import com.fn14.belajar.hibernate.Dao.MahasiswaDao;
import com.fn14.belajar.hibernate.Entity.Mahasiswa;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertTrue;
import org.hibernate.Session;
import org.junit.Test;

/**
 *
 * @author FN14
 */
public class TestDeleteByIdMahasiswa extends TestCase {
    
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
    public void testDeleteMahasiswa() {
//        init value
       
        this.session.beginTransaction();
//        save data and then return auto generated id
        Long mhsId = 1L;
        Optional<Mahasiswa> mhsOptional = this.dao.findById(mhsId);
        assertTrue("object mahasiswa is present", mhsOptional.isPresent());
        this.dao.removeBy(mhsOptional.get());
//        commit
        this.session.getTransaction().commit();
        System.out.println("mahasiswa delete : {}" + mhsOptional.get());
        //log.info("mahasiswa saved: {}", mahasiswa);
    }

    @Override
    protected void tearDown() throws Exception {
        //log.info("destroy hibernate session!");
        System.out.println("destroy hibernate session!");
        this.session.close();
    }
    
}
