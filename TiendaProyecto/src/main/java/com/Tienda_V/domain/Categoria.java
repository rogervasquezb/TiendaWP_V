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
@Table(name="Categoria")
public class Categoria implements Serializable {
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    @Column(name="id_credito")
    private Long idCategoria; //Hibernate lo tranforma en id_credito
    private String descripcion;
    private boolean activo;
    

    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

    
    
    
}
