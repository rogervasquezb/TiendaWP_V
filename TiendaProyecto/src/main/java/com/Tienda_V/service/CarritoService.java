/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tienda_V.service;

import com.Tienda_V.domain.Carrito;

/**
 *
 * @author rvasq
 */
public interface CarritoService {
    public Carrito getCarrito(Carrito carrito);
    public Carrito getCarritoCliente(long idCliente);
}
