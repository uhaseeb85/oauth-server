/**
 * 
 */
package com.springboot.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.dao.ClientInfo;
import com.springboot.rest.model.ClientInfoRequest;
import com.springboot.rest.model.ClientInfoResponse;
import com.springboot.rest.service.CreateClientService;
import com.springboot.rest.service.DeleteClientService;
import com.springboot.rest.service.GetClientService;
import com.springboot.rest.service.UpdateClientService;

/**
 * The Class GetClientsController.
 *
 * @author uhase
 */
@CrossOrigin(maxAge = 3600)
@RestController
public class ClientsController {
	
	
	/** The create client service. */
	@Autowired
	private CreateClientService createClientService;
	
	/** The delete client service. */
	@Autowired
	private DeleteClientService deleteClientService;
	
	/** The update client service. */
	@Autowired
	private UpdateClientService updateClientService;
	
	/** The get client service. */
	@Autowired
	private GetClientService getClientService;
	
	/**
	 * Creates the client.
	 *
	 * @param clientInfoRequest the client info request
	 * @return the client info response
	 */
	@PostMapping("/clients")
    @ResponseBody
	public ClientInfoResponse createClient(@RequestBody ClientInfoRequest clientInfoRequest) {
		return createClientService.createClient(clientInfoRequest);
	}
	
	/**
	 * Update client.
	 *
	 * @param clientInfoRequest the client info request
	 * @return the client info response
	 */
	@PatchMapping("/clients")
    @ResponseBody
	public ClientInfoResponse updateClient(@RequestBody ClientInfoRequest clientInfoRequest) {
		return updateClientService.updateClient(clientInfoRequest);
	}
	
	/**
	 * Gets the client.
	 *
	 * @param clientInfoRequest the client info request
	 * @return the client
	 */
	@GetMapping("/clients/{id}")
    @ResponseBody
	public ClientInfo getClient(@PathVariable("id") String id) {
		return getClientService.getClient(id);
	}
	
	/**
	 * Gets the all clients.
	 *
	 * @return the all clients
	 */
	@GetMapping("/clients")
    @ResponseBody
	public List<ClientInfo> getAllClients() {
		return getClientService.getAllClients();
	}
	
	/**
	 * Gets the all clients.
	 *
	 * @return the all clients
	 */
	@GetMapping("/login")
    @ResponseBody
	public String ping() {
		return "{\"token\":\"test123\"}";
	}
	
	/**
	 * Delete client.
	 *
	 * @param clientInfoRequest the client info request
	 * @return the client info response
	 */
	@DeleteMapping("/clients/{id}")
    @ResponseBody
	public ClientInfoResponse deleteClient(@PathVariable("id") String id) {
		return deleteClientService.deleteClient(id);
	}

}
