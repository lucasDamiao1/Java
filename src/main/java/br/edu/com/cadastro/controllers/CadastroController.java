package br.edu.com.cadastro.controllers;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.com.cadastro.domain.Pessoa;

@RestController
public class CadastroController {
    
    @GetMapping("/listar")
	public String listar(@RequestParam(value = "nome", defaultValue = "Mundo") String name ){
		return String.format("Ola %s!", name);
	}

	private final AtomicLong idGenerator = new AtomicLong();

    @GetMapping("/listarPessoa")
	public Pessoa listarPessoa(@RequestParam(value = "nome", defaultValue = "Nome não informado") String nome ){
		return  new Pessoa(idGenerator.incrementAndGet(), nome); //String.format("Ola %s!", name);
	}
}
