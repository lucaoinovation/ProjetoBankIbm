package com.projeto.helloBank.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.helloBank.daos.TransacaoDAO;
import com.projeto.helloBank.models.Conta;
import com.projeto.helloBank.models.Transacao;

@Service
public class TransacaoServiceImpl implements ITransacaoService {

	@Autowired
	private TransacaoDAO dao;

	@Override
	public Transacao criarNovo(Transacao novo) {
		return dao.save(novo);
	}

	@Override
	public ArrayList<Transacao> buscarTodos() {
		return (ArrayList<Transacao>) dao.findAll();
	}

	@Override
	public Transacao buscarPeloId(Integer id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public void excluirTransacao(Integer id) {
		dao.deleteById(id);

	}

	@Override
	public ArrayList<Transacao> buscarContas(Conta conta) {
		return (ArrayList<Transacao>) dao.findByConta(conta);
	}

}
