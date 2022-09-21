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

import com.projeto.helloBank.models.Cliente;
import com.projeto.helloBank.services.IClienteService;

@RestController
public class ClienteController {

	@Autowired
	private IClienteService service;

	@PostMapping("/clientes")
	public ResponseEntity<Cliente> incluirNovo(@RequestBody Cliente novo) {
		Cliente res = service.criarNovo(novo);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}

	@GetMapping("/clientes")
	public ArrayList<Cliente> recuperarTodos() {
		return service.buscarTodos();
	}

	@GetMapping("/cliente/{idCliente}")
	public ResponseEntity<Cliente> buscarPeloId(@PathVariable Integer idCliente) {
		Cliente res = service.buscarPeloId(idCliente);
		if (res != null) {
			return ResponseEntity.ok(res);

		}
		return ResponseEntity.notFound().build();
	}

	@PutMapping("/clientes")
	public ResponseEntity<Cliente> alterar(@RequestBody Cliente dados) {
		Cliente res = service.atualizarDados(dados);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}

	@DeleteMapping("/clientes/{idCliente}")
	public ResponseEntity<Cliente> excluirCliente(@PathVariable Integer idCliente) {
		service.excluirCliente(idCliente);
		return ResponseEntity.ok(null);
	}

}