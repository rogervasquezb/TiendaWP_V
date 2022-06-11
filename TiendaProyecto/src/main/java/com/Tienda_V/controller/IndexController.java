/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tienda_V.controller;

import com.Tienda_V.dao.ClienteDao;
import com.Tienda_V.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author rvasq
 */
@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model){
        

        
        log.info("Ahora se usa arquitectura MVC");
        /*
        String mensaje = "Estamos en la semana 4, Saludos";
        model.addAttribute("texto", mensaje);
        
        Cliente cliente = new Cliente("Roger", "Vasquez", "rvasquez0129@gmail.com", "8729-7603");
        model.addAttribute("cliente", cliente);
        
        Cliente cliente2 = new Cliente("Ignacio", "Leiton", "nacho231197@gmail.com", "8833-3838");
        Cliente cliente3 = new Cliente("Andres", "Leiton", "Andres121020@gmail.com", "8823-4538");
        var clientes = Arrays.asList(cliente, cliente2, cliente3);
        model.addAttribute("clientes", clientes);
        */
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        return "index";
    }
}
