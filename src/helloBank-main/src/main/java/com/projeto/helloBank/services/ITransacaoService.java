package com.projeto.helloBank.services;

import java.util.ArrayList;

import com.projeto.helloBank.models.Conta;
import com.projeto.helloBank.models.Transacao;



public interface ITransacaoService {
	
	public Transacao criarNovo(Transacao novo);
	public ArrayList<Transacao> buscarTodos();
	public Transacao buscarPeloId(Integer id);
	public void excluirTransacao(Integer id);
	public ArrayList<Transacao> buscarContas(Conta conta);
}
