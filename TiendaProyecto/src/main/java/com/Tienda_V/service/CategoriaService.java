/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tienda_V.service;

import com.Tienda_V.domain.Categoria;
import java.util.List;

/**
 *
 * @author rvasq
 */
public interface CategoriaService {
    public List<Categoria> getCategorias(boolean activo);
    public Categoria getCategoria(Categoria categoria);
    public void save(Categoria categoria);
    public void delete(Categoria categoria);
    
}