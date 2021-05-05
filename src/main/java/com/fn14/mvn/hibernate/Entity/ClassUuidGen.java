/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate.Entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import org.hibernate.annotations.GenericGenerator;
 
/**
 *
 * @author FN14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(
        name = "tb_kelas_uuid"
)
@GenericGenerator(name = "kelas_uuid_gen", strategy = "uuid2")
public class ClassUuidGen { 
    @Id
    @Column(name = "kode")
    @GeneratedValue(generator = "kelas_uuid_gen")
    private String id;
    @Column(name="nama", length=20)
    private String name;
    @Column(name = "angkatan", length = 4)
    private Integer years;
    @Column(name = "craeted_by")
    private String CreatedBy;
    @Column(name = "created_date")
    private LocalDateTime createdDateTime;
    @Column(name = "update_by")
    private String lastUpdateBy;
    @Column(name = "update_date")
    private LocalDateTime lastUpdateDateTime;

    
}
