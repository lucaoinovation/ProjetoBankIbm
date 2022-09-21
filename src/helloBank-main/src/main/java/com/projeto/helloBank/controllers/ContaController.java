package com.projeto.helloBank.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.helloBank.models.Conta;
import com.projeto.helloBank.services.IContaService;

@RestController
public class ContaController {

	@Autowired
	private IContaService service;

	@PostMapping("/contas")
	public ResponseEntity<Conta> incluirNovo(@RequestBody Conta novo) {
		Conta res = service.criarNovo(novo);
		if (res != null) {
			return ResponseEntity.ok(res);

		}
		return ResponseEntity.notFound().build();
	}

	@GetMapping("/contas")
	public ArrayList<Conta> recuperarTodos() {
		return service.buscarTodos();
	}

	@GetMapping("/contas/{idConta}")
	public ResponseEntity<Conta> buscarPeloId(@PathVariable Integer idConta) {
		Conta res = service.buscarPeloId(idConta);
		if (res != null) {
			return ResponseEntity.ok(res);

		}
		return ResponseEntity.notFound().build();
	}

	@PutMapping("/conta")
	public ResponseEntity<Conta> alterar(@RequestBody Conta dados) {
		Conta res = service.atualizarDados(dados);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}

	@DeleteMapping("/conta/{idConta}")
	public ResponseEntity<Conta> excluirConta(@PathVariable Integer idConta) {
		service.excluirConta(idConta);
		return ResponseEntity.ok(null);
	}

	@PutMapping("depositar/{valor}/{idConta}")
	public ResponseEntity<?> depositar(@PathVariable Double valor, @PathVariable Integer idConta) {
		service.depositar(valor, idConta);
		return ResponseEntity.ok(null);
	}

	@PutMapping("sacar/{valor}/{idConta}")
	public ResponseEntity<?> sacar(@PathVariable Double valor, @PathVariable Integer idConta) {
		service.sacar(valor, idConta);
		return ResponseEntity.ok(null);

	}
}