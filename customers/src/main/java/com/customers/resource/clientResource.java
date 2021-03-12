package com.customers.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.customers.model.client;
import com.customers.repository.clientRepository;

@RestController
@RequestMapping("/clients")
public class clientResource {
	
	@Autowired
	private clientRepository clientRepository;
	
	@GetMapping
	public List<client> listar(){
		return clientRepository.findAll();
	}
	
	@GetMapping("/{codigo}")
	public Optional<client> buscaPeloCodigo(@PathVariable Long codigo){
		return clientRepository.findById(codigo);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void criar(@RequestBody client client) {
		clientRepository.save(client);
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		clientRepository.deleteById(codigo);
	}
	
//	@PutMapping("/{codigo}")
//	public ResponseEntity<client> atualizar(@PathVariable Long codigo, @Validated @RequestBody client client){
//		client clientSalva = clientRepository.findOne(codigo);
//		BeanUtils.copyProperties(client, clientSalva, "codigo");
//		clientRepository.save(clientSalva);
//		return ResponseEntity.ok(clientSalva);
	
	
}
