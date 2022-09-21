package com.projeto.helloBank.daos;

import org.springframework.data.repository.CrudRepository;

import com.projeto.helloBank.models.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {
		
}
