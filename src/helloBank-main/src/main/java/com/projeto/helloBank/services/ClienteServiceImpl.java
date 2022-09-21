package com.projeto.helloBank.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.helloBank.daos.ClienteDAO;
import com.projeto.helloBank.models.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private ClienteDAO dao;

	@Override
	public Cliente criarNovo(Cliente novo) {
		if (novo.getNome()!= null) {
			return dao.save(novo);
		}
		return null;
	}

	@Override
	public Cliente atualizarDados(Cliente dados) {
		if (dados.getCpf()!= null && dados.getNome()!= null) {
			return dao.save(dados);
		}
		return null;
	}


	@Override
	public ArrayList<Cliente> buscarTodos() {

		return (ArrayList<Cliente>) dao.findAll();
	}

	@Override
	public Cliente buscarPeloId(Integer id) {
		return dao.findById(id).orElse(null);

	}

	@Override
	public void excluirCliente(Integer id) {
		 dao.deleteById(id);

	}

}
