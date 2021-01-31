package com.devsuperior.Client.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.Client.entities.Client;
import com.devsuperior.Client.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository; 
	
	public List<Client> findall(){
		return repository.findAll(); 
	}

}
