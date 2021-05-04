package com.fn14.mvn.hibernate.Entity;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ClassSeqGen.class)
public abstract class ClassSeqGen_ {

	public static volatile SingularAttribute<ClassSeqGen, LocalDateTime> lastUpdateDateTime;
	public static volatile SingularAttribute<ClassSeqGen, String> CreatedBy;
	public static volatile SingularAttribute<ClassSeqGen, String> name;
	public static volatile SingularAttribute<ClassSeqGen, LocalDateTime> createdDateTime;
	public static volatile SingularAttribute<ClassSeqGen, Long> id;
	public static volatile SingularAttribute<ClassSeqGen, Integer> years;
	public static volatile SingularAttribute<ClassSeqGen, String> lastUpdateBy;

	public static final String LAST_UPDATE_DATE_TIME = "lastUpdateDateTime";
	public static final String CREATED_BY = "CreatedBy";
	public static final String NAME = "name";
	public static final String CREATED_DATE_TIME = "createdDateTime";
	public static final String ID = "id";
	public static final String YEARS = "years";
	public static final String LAST_UPDATE_BY = "lastUpdateBy";

}

