/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.belajar.hibernate.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

/**
 *
 * @author FN14
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="mahasiswa")
public class Mahasiswa {
    @Id
    private long kode;
    
    @Column(length=35)
    private String nim;
    
    @Column(length=50)
    private String nama_mahasiswa;
    
    @Column(length=4)
    private Integer tahun_masuk;
    
    private LocalDate tgl_lahir;
    
    private LocalDateTime create_date;
    
    private String create_by;
    
    private boolean active;
    
    @Type(type="text")
    private String biodate;
    
    
    
            
}
