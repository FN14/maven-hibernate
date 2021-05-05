/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author FN14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@IdClass(ClassForIdClass.class)
@Table(name = "kelas_idclass" )
public class ClassForIdClassModel {
    
    @Id
    @Column(name = "tahun_angkatan", length = 4, columnDefinition = "int check(tahun_angkatan >= 1999)")
    private Integer years;
    @Id
    @Column(name = "class_id", length = 50)
    private String classId;
    @Column(name = "nama_kelas")
    private String name;
    @Column(name = "prodi")
    private String programStudy;
    @Column(name = "description")
    private String Description;
}
