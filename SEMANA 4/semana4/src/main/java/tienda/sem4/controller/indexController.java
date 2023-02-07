/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.sem4.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Laboratorios
 */

@Controller
@Slf4j
public class indexController {
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Estamos usando una arquitectura");
        Cliente cliente = new Cliente("Pedro");
        var mensaje = "desde back-end";
        model.addAttribute("mensaje",mensaje);
        return "index";
    }
    
}
