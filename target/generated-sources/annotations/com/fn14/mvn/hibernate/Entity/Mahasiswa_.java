package com.fn14.mvn.hibernate.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Mahasiswa.class)
public abstract class Mahasiswa_ {

	public static volatile SingularAttribute<Mahasiswa, String> create_by;
	public static volatile SingularAttribute<Mahasiswa, String> nim;
	public static volatile SingularAttribute<Mahasiswa, String> nama_mahasiswa;
	public static volatile SingularAttribute<Mahasiswa, Long> kode;
	public static volatile SingularAttribute<Mahasiswa, Integer> tahun_masuk;
	public static volatile SingularAttribute<Mahasiswa, Boolean> active;
	public static volatile SingularAttribute<Mahasiswa, LocalDateTime> create_date;
	public static volatile SingularAttribute<Mahasiswa, String> biodate;
	public static volatile SingularAttribute<Mahasiswa, LocalDate> tgl_lahir;

	public static final String CREATE_BY = "create_by";
	public static final String NIM = "nim";
	public static final String NAMA_MAHASISWA = "nama_mahasiswa";
	public static final String KODE = "kode";
	public static final String TAHUN_MASUK = "tahun_masuk";
	public static final String ACTIVE = "active";
	public static final String CREATE_DATE = "create_date";
	public static final String BIODATE = "biodate";
	public static final String TGL_LAHIR = "tgl_lahir";

}

