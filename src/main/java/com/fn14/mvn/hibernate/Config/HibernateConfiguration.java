/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate.Config;

import com.fn14.mvn.hibernate.Entity.*;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author FN14
 */
@Slf4j
public class HibernateConfiguration {
    private static final SessionFactory ourSessionFactory;

    static {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            MetadataSources metadataSources = new MetadataSources(registry); 
//            TODO add your mapping here!
            metadataSources.addAnnotatedClass(Mahasiswa.class)
                    .addAnnotatedClass(ClassRootWithUniqueConstraints.class) 
                    .addAnnotatedClass(EmployeeWithCheckConstraint.class)
                    .addAnnotatedClass(ClassSeqGen.class) 
                    .addAnnotatedClass(ClassUuidGen.class);
                      
            ourSessionFactory = metadataSources.buildMetadata().buildSessionFactory();

        } catch (Throwable ex) {
            StandardServiceRegistryBuilder.destroy(registry);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }
}
