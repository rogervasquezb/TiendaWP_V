/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tienda_V.domain;

/**
 *
 * @author rvasq
 */
import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Credito")
public class Credito implements Serializable {
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    @Column(name="id_credito")
    private Long idCredito; //Hibernate lo tranforma en id_credito
    private double limite;

    public Credito() {
    }

    public Credito(double limite) {
        this.limite = limite;
    }
    
    
}
