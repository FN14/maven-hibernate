/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate.primaryKey;

import com.fn14.mvn.hibernate.Config.HibernateConfiguration;
import com.fn14.mvn.hibernate.Dao.ClassForIdClassDao;
import com.fn14.mvn.hibernate.Entity.ClassForIdClass;
import com.fn14.mvn.hibernate.Entity.ClassForIdClassModel;
import java.util.Optional;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.junit.Test;

/**
 *
 * @author FN14
 */
@Slf4j
public class TestClassForIdClass extends TestCase {
    
    private Session session;
    private ClassForIdClassDao clIdClassDao;
    
    @Override
    protected void setUp() throws Exception{
        log.info("Init hibernate Session");
        this.session = HibernateConfiguration.getSession();
        this.clIdClassDao = new ClassForIdClassDao(session);
        
    }
    
    @Test
    public void testInsertValid(){
        ClassForIdClassModel clIdClassMod = ClassForIdClassModel.builder()
                .classId("si-111")
                .years(2021)
                .name("si-111 Firmansyah") 
                .programStudy("Teknik Informatika")
                .Description("Tes aja").build();
        this.session.beginTransaction();
        clIdClassMod = this.clIdClassDao.Save(clIdClassMod);
        log.info("Insert value : {}" , clIdClassMod);
        this.session.getTransaction().commit();
        
        Optional<ClassForIdClassModel> optIdClass = this.clIdClassDao.findById(ClassForIdClass.builder()
                .classId("si-111")
                .years(2021).build()
        );
        
        assertTrue("Data find by id is present", optIdClass.isPresent());
        log.info(" class id class get data : {} ", optIdClass.get()); 
    }
    
    @Override
    protected void tearDown() throws Exception{
        log.info("destroy hibernate session !");
        this.session.close();
    }
}
