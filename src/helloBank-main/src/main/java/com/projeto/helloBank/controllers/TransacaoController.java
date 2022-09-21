package com.projeto.helloBank.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.helloBank.models.Transacao;
import com.projeto.helloBank.services.ITransacaoService;

@RestController
public class TransacaoController {
	
	@Autowired
	private ITransacaoService service;
	
	@PostMapping("/transacao")
	public ResponseEntity<Transacao> incluirNovo(@RequestBody Transacao novo) {
		Transacao res = service.criarNovo(novo);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@GetMapping("/transacao")
	public ArrayList<Transacao> recuperarTodos() {
		return service.buscarTodos();
	}
	
	@GetMapping("/transacao/{idTransacao}")
	public ResponseEntity<Transacao> buscarPeloId(@PathVariable Integer idTransacao) {
		Transacao res = service.buscarPeloId(idTransacao);
		if (res != null) {
			return ResponseEntity.ok(res);

		}
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/transacao/{idTransacao}")
	public ResponseEntity<Transacao> excluirTransacao(@PathVariable Integer idTransacao) {
		service.excluirTransacao(idTransacao);
		return ResponseEntity.ok(null);
	}
	

}
