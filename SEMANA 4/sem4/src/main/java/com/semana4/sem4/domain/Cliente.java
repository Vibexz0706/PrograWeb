package com.semana4.sem4.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="cliente")

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcliente;
    private String nombre;
    private String apellidos;
    private String Correo;
    private String telefono;

    public Cliente(){

    }

   
    public Cliente(String nombre, String apellidos, String Correo,String telefono){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Correo = Correo;
        this.telefono = telefono;


    }



    
    
}
