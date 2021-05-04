/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.belajar.hibernate.Entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/** 
 *
 * @author FN14
 */
@Data
@Entity
@Table(name = "employee_check") 
public class EmployeeWithCheckConstraint {
    @Id 
    private String id;
    private String name;
    @Column(name="gaji",columnDefinition = "decimal check(gaji >= 2000000)")
    private BigDecimal salary; 
    @Column(name="create_by")
    private String createBy;
    @Column(name="create_date")
    private LocalDateTime createDate;
    @Column(name="update_by")
    private String updateBy;
    @Column(name="update_date")
    private LocalDateTime updateDate; 
}
