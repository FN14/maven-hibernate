/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.belajar.hibernate;

import com.fn14.mvn.hibernate.Config.HibernateConfiguration;
import com.fn14.mvn.hibernate.Dao.MahasiswaDao;
import com.fn14.mvn.hibernate.Entity.Mahasiswa;
import java.time.LocalDate;
import java.time.LocalDateTime;
import junit.framework.TestCase;
import org.hibernate.Session;
import org.junit.Test;

/**
 *
 * @author FN14
 */
public class TestUpdateMahasiswa extends TestCase {
    
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
    public void testSaveMahasiswa() {
//        init value
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setKode(2L);
        mahasiswa.setNim("10511148");
        mahasiswa.setNama_mahasiswa("Muhammad Firmansyah (Updated)");
        mahasiswa.setActive(true);
        mahasiswa.setCreate_by("admin");
        mahasiswa.setCreate_date(LocalDateTime.now());
        mahasiswa.setTgl_lahir(LocalDate.of(1999, 9, 9));
        mahasiswa.setTahun_masuk(2015);

        this.session.beginTransaction();
//        save data and then return auto generated id
        mahasiswa = this.dao.Update(mahasiswa);

//        commit
        this.session.getTransaction().commit();
        System.out.println("mahasiswa saved: {}" + mahasiswa);
        //log.info("mahasiswa saved: {}", mahasiswa);
    }

    @Override
    protected void tearDown() throws Exception {
        //log.info("destroy hibernate session!");
        System.out.println("destroy hibernate session!");
        this.session.close();
    }
    
}
