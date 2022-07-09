/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tienda_V.dao;

import com.Tienda_V.domain.Credito;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author rvasq
 */

public interface CreditoDao extends CrudRepository<Credito, Long>{
    
}
