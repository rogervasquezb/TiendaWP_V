/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tienda_V.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author rvasq
 */
@Data
@Entity
@Table(name="carrito")
public class Carrito implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarrito; 
    private Long idCliente;
    public Carrito() {
    }
    public Carrito(Long idCliente) {
        this.idCliente = idCliente;
    }  
}
