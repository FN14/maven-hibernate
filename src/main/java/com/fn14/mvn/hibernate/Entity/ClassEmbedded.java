/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate.Entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "kelas_embedded")
public class ClassEmbedded {
     
    @EmbeddedId
    private ClassEmbedebleId id;
    @Column(name = "kelas_name")
    private String name;
    @Column(name = "prodi")
    private String programStudy;
    @Column(name = "description")
    private String Description;
}
