package com.springboot.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rest.dao.ClientInfo;
import com.springboot.rest.dao.ClientInfoRepository;

/**
 * The Class GetClientService.
 */
@Service
public class GetClientService {
	
	/** The client info repository. */
	@Autowired
	private ClientInfoRepository clientInfoRepository;

	/**
	 * Gets the client.
	 *
	 * @param id the id
	 * @return the client
	 */
	public ClientInfo getClient(String id) {
		Optional<ClientInfo> clientInfo =  clientInfoRepository.findById(id);
		return clientInfo.get();
	}

	/**
	 * Gets the all clients.
	 *
	 * @param clientInfoRequest the client info request
	 * @return the all clients
	 */
	public List<ClientInfo> getAllClients() {
		return clientInfoRepository.findAll();
	}

}
