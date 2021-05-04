package com.fn14.mvn.hibernate;

import com.fn14.mvn.hibernate.Config.HibernateConfiguration;
import junit.framework.TestCase;
import org.hibernate.Session;
import org.junit.Ignore;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
@Ignore
public class AppTest  extends TestCase
{
    /**
     * Rigorous Test :-)
     */
    private Session session;

    @Override
    protected void setUp() throws Exception {
        //log.info("init hibernate session");
        System.out.println("init hibernate session");
        this.session = HibernateConfiguration.getSession();
    }

    @Test
    public void testOpenConnection() {
        this.session.beginTransaction();
    }

    @Override
    protected void tearDown() throws Exception {
        //log.info("destroy hibernate session!");
        System.out.println("destroy hibernate session!");
        this.session.close();
    }
}
