package com.springboot.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rest.dao.ClientInfoRepository;
import com.springboot.rest.model.ClientInfoRequest;
import com.springboot.rest.model.ClientInfoResponse;
import com.springboot.rest.model.StatusInfo;

@Service
public class DeleteClientService {
	
	@Autowired
	private ClientInfoRepository clientInfoRepository;

	public ClientInfoResponse deleteClient(ClientInfoRequest clientInfoRequest) {
		try {
			clientInfoRepository.deleteById(clientInfoRequest.getClientId());
			return new ClientInfoResponse(new StatusInfo("1000","Delete Client Operation completed successfully."));
		} catch (Exception e) {
			return new ClientInfoResponse(new StatusInfo("1002","Delete Client Operation has Failed."));
		}
	}

}
