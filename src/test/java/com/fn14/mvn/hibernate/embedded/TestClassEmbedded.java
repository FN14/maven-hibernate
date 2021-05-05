/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate.embedded;

import com.fn14.mvn.hibernate.Config.HibernateConfiguration;
import com.fn14.mvn.hibernate.Dao.ClassEmbeddedDao;
import com.fn14.mvn.hibernate.Entity.ClassEmbedded;
import com.fn14.mvn.hibernate.Entity.ClassEmbedebleId;

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
@Ignore
@Slf4j
public class TestClassEmbedded extends TestCase{
    
    private Session session;
    private ClassEmbeddedDao classEmbeddedDao;
    
    @Override
    protected void setUp() throws Exception{
        log.info("Init hibernate Session");
        this.session = HibernateConfiguration.getSession();
        this.classEmbeddedDao = new ClassEmbeddedDao(session);
        
    }
    
    @Test
    public void testInsertValid(){
        ClassEmbedded classEmb = ClassEmbedded.builder()
                .id( ClassEmbedebleId.builder()
                        .classId("fn-14")
                        .year(2021).build()
                )
                .name("Muhammad Firmansyah")
                .programStudy("Teknik Informatika")
                .Description("Tes aja").build();
        this.session.beginTransaction();
        classEmb = this.classEmbeddedDao.Save(classEmb);
        log.info("Insert value : {}" , classEmb);
        this.session.getTransaction().commit();
        
    }
    
    @Override
    protected void tearDown() throws Exception{
        log.info("destroy hibernate session !");
        this.session.close();
    }
}
