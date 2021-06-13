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
 * @author uhase
 *
 */
@Service
public class UpdateClientService {

	@Autowired
	private ClientInfoRepository clientInfoRepository;

	public ClientInfoResponse updateClient(ClientInfoRequest clientInfoRequest) {
		try {
			ClientInfo clientInfo = clientInfoRepository.save(convertToClienInfoEntity(clientInfoRequest));
			return new ClientInfoResponse(clientInfo.getId(), clientInfo.getClientSecret());
		} catch (Exception e) {
			e.printStackTrace();
			return new ClientInfoResponse(new StatusInfo("1003", "Update Client Operation has Failed."));
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
