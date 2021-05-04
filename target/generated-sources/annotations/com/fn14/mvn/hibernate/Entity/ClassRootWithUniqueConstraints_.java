package com.fn14.mvn.hibernate.Entity;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ClassRootWithUniqueConstraints.class)
public abstract class ClassRootWithUniqueConstraints_ {

	public static volatile SingularAttribute<ClassRootWithUniqueConstraints, String> createBy;
	public static volatile SingularAttribute<ClassRootWithUniqueConstraints, LocalDateTime> updateDate;
	public static volatile SingularAttribute<ClassRootWithUniqueConstraints, Integer> year;
	public static volatile SingularAttribute<ClassRootWithUniqueConstraints, String> updateBy;
	public static volatile SingularAttribute<ClassRootWithUniqueConstraints, String> name;
	public static volatile SingularAttribute<ClassRootWithUniqueConstraints, String> id;
	public static volatile SingularAttribute<ClassRootWithUniqueConstraints, LocalDateTime> createDate;

	public static final String CREATE_BY = "createBy";
	public static final String UPDATE_DATE = "updateDate";
	public static final String YEAR = "year";
	public static final String UPDATE_BY = "updateBy";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String CREATE_DATE = "createDate";

}

