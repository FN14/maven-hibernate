/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.belajar.hibernate;

import com.fn14.mvn.hibernate.Config.HibernateConfiguration;
import com.fn14.mvn.hibernate.Dao.EmployeeWithCheckConstraintDao;
import com.fn14.mvn.hibernate.Entity.EmployeeWithCheckConstraint;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
import junit.framework.TestCase;
import org.hibernate.Session;
import org.junit.Test;

/**
 *
 * @author FN14
 */
public class TestCheckConstraint extends TestCase {
    private Session session;
    private EmployeeWithCheckConstraintDao dao;

    @Override
    protected void setUp() throws Exception {
        //log.info("init hibernate session");
        System.out.println("init hibernate session");
        this.session = HibernateConfiguration.getSession();
        this.dao = new EmployeeWithCheckConstraintDao(session);
    }

    @Test
    public void testInsertValid() {
        EmployeeWithCheckConstraint check = new EmployeeWithCheckConstraint();
        check.setId(UUID.randomUUID().toString());
        check.setName("IPS 2");
        check.setSalary(new BigDecimal(4_500_000));
        check.setCreateBy("admin");
        check.setCreateDate(LocalDateTime.now());

        this.session.beginTransaction();
        this.dao.Save(check);
        this.session.getTransaction().commit();
    }

    @Test
    public void testInsertInValid() {
        EmployeeWithCheckConstraint check = new EmployeeWithCheckConstraint();
        check.setId(UUID.randomUUID().toString());
        check.setName("IPS 1");
        check.setSalary(new BigDecimal(1_500_000));
        check.setCreateBy("admin");
        check.setCreateDate(LocalDateTime.now());

        this.session.beginTransaction();
        this.dao.Save(check);
        this.session.getTransaction().commit();
    }

    @Override
    protected void tearDown() throws Exception {
        //log.info("destroy hibernate session!");
        System.out.println("destroy hibernate session!");
        this.session.close();
    }
}
