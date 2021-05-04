# maven-hibernate
Project create crud use hibernate maven

tambahkan file hibernate.cfg.xml di src/main/resources
isi nya :

```markdown
<?xml version="1.0" encoding="UTF-8"?>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD//EN"
        "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
    <session-factory>
        <!-- connection db -->
        <property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/dbname</property>
        <property name="hibernate.connection.driver_class">org.postgresql.Driver</property>
        <property name="hibernate.connection.username"></property>
        <property name="hibernate.connection.password"></property>

        <!-- show generated sql -->
        <property name="hibernate.show_sql">true</property>
        <property name="hibernate.format_sql">true</property>
        
        <!-- set default not auto commit -->
        <property name="hibernate.connection.autocommit">false</property>

        <!-- how hibernate translate from java to db -->
        <property name="hibernate.dialect">org.hibernate.dialect.PostgreSQL10Dialect</property>
        
        <!-- DB schema will be updated if needed -->
        <property name="hibernate.hbm2ddl.auto">update</property>
        
         <!-- connection pooling-->
        <property name="hibernate.connection.pool_size">10</property>
        <property name="hibernate.c3p0.min_size">5</property>
        <property name="hibernate.c3p0.max_size">20</property>
        <property name="hibernate.c3p0.timeout">1800</property>
        <property name="hibernate.c3p0.max_statements">50</property>
        
      
        
    </session-factory>
</hibernate-configuration>
```
