/**
 * 
 */
package com.springboot.rest.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rest.dao.ClientInfo;
import com.springboot.rest.dao.ClientInfoRepository;
import com.springboot.rest.model.ClientInfoRequest;
import com.springboot.rest.model.ClientInfoResponse;
import com.springboot.rest.model.StatusInfo;

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
			ClientInfo input = convertToClienInfoEntity(clientInfoRequest);
			ClientInfo clientInfo = clientInfoRepository.save(input);
			return new ClientInfoResponse(clientInfo.getId(), clientInfo.getClientSecret());
		} catch (Exception e) {
			e.printStackTrace();
			return new ClientInfoResponse(new StatusInfo("1001", "Create Client Operation has Failed."));
		}

	}

	/**
	 * Convert to clien info entity.
	 *
	 * @param clientInfoRequest the client info request
	 * @return the client info
	 */
	public ClientInfo convertToClienInfoEntity(ClientInfoRequest clientInfoRequest) {
		return new ClientInfo(clientInfoRequest.getClientName() + "-" + UUID.randomUUID().toString(),
				clientInfoRequest.getClientName(), clientInfoRequest.getRedirectUrl(),
				clientInfoRequest.getClientContact(), clientInfoRequest.getScope(),
				clientInfoRequest.getDestinationOrg(), UUID.randomUUID().toString());
	}

}
