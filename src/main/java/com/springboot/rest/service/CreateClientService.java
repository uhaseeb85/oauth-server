/**
 * 
 */
package com.springboot.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rest.dao.ClientInfo;
import com.springboot.rest.dao.ClientInfoRepository;
import com.springboot.rest.model.ClientInfoRequest;
import com.springboot.rest.model.ClientInfoResponse;
import com.springboot.rest.model.StatusInfo;
import com.springboot.rest.utils.ClientUtils;

/**
 * The Class CreateClientService.
 *
 * @author uhase
 */
@Service
public class CreateClientService {
	
	/** The client info repository. */
	@Autowired
	private ClientInfoRepository clientInfoRepository;

	/**
	 * Creates the client.
	 *
	 * @param clientInfoRequest the client info request
	 * @return the client info response
	 */
	public ClientInfoResponse createClient(ClientInfoRequest clientInfoRequest) {
		try {
			ClientInfo clientInfo = clientInfoRepository.save(ClientUtils.convertToClienInfoEntity(clientInfoRequest));
			return new ClientInfoResponse(clientInfo.getId(),clientInfo.getClientSecret());
		} catch (Exception e) {
			return new ClientInfoResponse(new StatusInfo("1001","Create Client Operation has Failed."));
		}
		
	}

}
