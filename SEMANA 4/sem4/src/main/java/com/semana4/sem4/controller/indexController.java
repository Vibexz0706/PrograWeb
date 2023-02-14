package com.semana4.sem4.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.semana4.sem4.dao.ClienteDao;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j

public class indexController {

    @Autowired

    private ClienteDao clienteDao; 


    @GetMapping("/")

    public String inicio(Model model) {
        log.info("hoaaaaaaaaa");


        
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        
        return "index";
    }
    


    
}
