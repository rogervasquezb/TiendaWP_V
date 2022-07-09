/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tienda_V.service;

import com.Tienda_V.domain.Articulo;
import java.util.List;

/**
 *
 * @author rvasq
 */
public interface ArticuloService {
    public List<Articulo> getArticulos(boolean activo);
    public Articulo getArticulo(Articulo articulo);
    public void save(Articulo articulo);
    public void delete(Articulo articulo);
    
}
