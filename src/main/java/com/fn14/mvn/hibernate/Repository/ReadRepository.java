/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author FN14
 */
public interface ReadRepository<T, PK> {
    Optional<T> findById(PK value);

    List<T> findAll();
}
