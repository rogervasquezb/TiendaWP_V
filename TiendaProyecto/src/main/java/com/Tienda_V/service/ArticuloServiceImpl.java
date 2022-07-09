package com.Tienda_V.service;

import com.Tienda_V.dao.ArticuloDao;
import com.Tienda_V.domain.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author rvasq
 */
@Service
public class ArticuloServiceImpl implements ArticuloService {

    @Autowired
    private ArticuloDao articuloDao;


    @Override
    @Transactional(readOnly = true)
    public List<Articulo> getArticulos(boolean activo) { //activo = true
        var lista = (List<Articulo>)articuloDao.findAll(); //Count = 4
        if(activo){
            lista.removeIf(e -> !e.isActivo());      
        }
        return lista; //Count 4
    }

    @Override
    @Transactional(readOnly = true)
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getIdArticulo()).orElse(null);
    
    }

    
    @Override
    @Transactional
    public void save(Articulo articulo) {
        articuloDao.save(articulo);
    }
    
    @Override
    @Transactional
    public void delete(Articulo articulo) {
        articuloDao.delete(articulo);
    }

}