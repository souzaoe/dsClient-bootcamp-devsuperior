package com.devsuperior.Client.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.Client.entities.Client;
import com.devsuperior.Client.services.ClientService;


@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@Autowired
	private ClientService service;  
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = service.findall(); 
		return ResponseEntity.ok().body(list); 
		
	}

}
