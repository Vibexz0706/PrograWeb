/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.sem4.domain;

import lombok.Data;

/**
 *
 * @author Laboratorios
 */

@Data
public class Cliente {
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public Cliente() {

    }
    
    
}
