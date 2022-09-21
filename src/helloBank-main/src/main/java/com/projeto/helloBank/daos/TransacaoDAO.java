package com.projeto.helloBank.daos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projeto.helloBank.models.Conta;
import com.projeto.helloBank.models.Transacao;

public interface TransacaoDAO extends CrudRepository<Transacao, Integer> {
	
		List<Transacao>findByConta(Conta conta);
}
