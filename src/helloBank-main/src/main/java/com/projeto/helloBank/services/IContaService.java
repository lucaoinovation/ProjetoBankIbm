package com.projeto.helloBank.services;

import java.util.ArrayList;

import com.projeto.helloBank.models.Conta;

public interface IContaService {
	
	public Conta criarNovo(Conta novo);
	public Conta atualizarDados(Conta dados);
	public ArrayList<Conta> buscarTodos();
	public Conta buscarPeloId(Integer id);
	public void excluirConta(Integer id);
	public void sacar(Double valor, Integer id);
	public void depositar(Double valor, Integer id);
}
