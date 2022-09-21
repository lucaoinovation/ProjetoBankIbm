package com.projeto.helloBank.daos;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.helloBank.models.Conta;

@Transactional(readOnly = false)
public interface ContaDAO extends CrudRepository<Conta, Integer> {
		
	@Modifying
	@Query("update Conta c set c.saldo = c.saldo + ?1 where c.idConta = ?2")
	void setFixedSaldoFor(Double  valor, int id);
	
	
	Conta findByIdConta(Integer id);
	
	@Modifying
	@Query("update Conta c set c.saldo = c.saldo - ?1 where c.idConta = ?2")
	void setFixedSaldo(Double  valor, Integer id);
	
}
