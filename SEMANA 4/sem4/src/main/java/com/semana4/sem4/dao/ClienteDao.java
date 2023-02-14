package com.semana4.sem4.dao;

import org.springframework.data.repository.CrudRepository;

import com.semana4.sem4.domain.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long> {
    
}
