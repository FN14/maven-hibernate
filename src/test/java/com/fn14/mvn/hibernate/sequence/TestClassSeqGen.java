/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate.sequence;

import com.fn14.mvn.hibernate.Config.HibernateConfiguration;
import com.fn14.mvn.hibernate.Dao.ClassSeqGenDao;
import com.fn14.mvn.hibernate.Entity.ClassSeqGen;
import java.time.LocalDateTime;

import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author FN14
 */
@Slf4j

public class TestClassSeqGen extends TestCase {
    private Session session;
    private ClassSeqGenDao classSeqGen;
    
    @Override
    protected void setUp() throws Exception{
        log.info("Init hibernate Session");
        this.session = HibernateConfiguration.getSession();
        this.classSeqGen = new ClassSeqGenDao(session);
    }
    
    @Test
    public void testInsertValid(){
        ClassSeqGen classSG = ClassSeqGen.builder()
                .name("Muhammad Firmansyah")
                .years(2021)
                .CreatedBy("admin")
                .createdDateTime(LocalDateTime.now()).build();
        this.session.beginTransaction();
        classSG = this.classSeqGen.Save(classSG);
        log.info("Insert value : {}" , classSG);
        this.session.getTransaction().commit();
        
    }
    
    @Override
    protected void tearDown() throws Exception{
        log.info("destroy hibernate session !");
        this.session.close();
    }
    
}
