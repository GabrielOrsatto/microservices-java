package br.edu.atitus.paradigma.saudacao_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoController {

	@GetMapping
	public ResponseEntity<String> getSaudacao() {
		return ResponseEntity.ok("Hello World!");
	}
}
