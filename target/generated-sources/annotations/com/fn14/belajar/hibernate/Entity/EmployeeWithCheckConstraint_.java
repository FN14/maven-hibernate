package com.fn14.belajar.hibernate.Entity;

import com.fn14.mvn.hibernate.Entity.EmployeeWithCheckConstraint;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EmployeeWithCheckConstraint.class)
public abstract class EmployeeWithCheckConstraint_ {

	public static volatile SingularAttribute<EmployeeWithCheckConstraint, String> createBy;
	public static volatile SingularAttribute<EmployeeWithCheckConstraint, LocalDateTime> updateDate;
	public static volatile SingularAttribute<EmployeeWithCheckConstraint, String> updateBy;
	public static volatile SingularAttribute<EmployeeWithCheckConstraint, String> name;
	public static volatile SingularAttribute<EmployeeWithCheckConstraint, String> id;
	public static volatile SingularAttribute<EmployeeWithCheckConstraint, BigDecimal> salary;
	public static volatile SingularAttribute<EmployeeWithCheckConstraint, LocalDateTime> createDate;

	public static final String CREATE_BY = "createBy";
	public static final String UPDATE_DATE = "updateDate";
	public static final String UPDATE_BY = "updateBy";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String SALARY = "salary";
	public static final String CREATE_DATE = "createDate";

}

