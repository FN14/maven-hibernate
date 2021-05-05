/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author FN14
 */
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClassEmbedebleId implements Serializable {
    
    @Column(name = "tahun_angkatan", length= 4, columnDefinition = "int check(tahun_angkatan >= 1999)")
    private Integer year;
    @Column(name = "class_id")
    private String classId;
    
}
