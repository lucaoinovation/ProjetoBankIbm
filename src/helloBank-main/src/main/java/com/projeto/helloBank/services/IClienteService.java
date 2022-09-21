package com.projeto.helloBank.services;

import java.util.ArrayList;

import com.projeto.helloBank.models.Cliente;


public interface IClienteService {

	public Cliente criarNovo(Cliente novo);
	public Cliente atualizarDados(Cliente dados);
	public ArrayList<Cliente> buscarTodos();
	public Cliente buscarPeloId(Integer id);
	public void excluirCliente(Integer id);
}


