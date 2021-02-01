package com.devsuperior.Client.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.Client.dto.ClientDTO;
import com.devsuperior.Client.entities.Client;
import com.devsuperior.Client.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository; 
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findall() {
		List<Client> list = repository.findAll(); 
		
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList()); 
		
	}
	
}
