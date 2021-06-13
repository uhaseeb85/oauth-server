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
 * @author uhase
 *
 */
@Service
public class UpdateClientService {

	@Autowired
	private ClientInfoRepository clientInfoRepository;

	public ClientInfoResponse updateClient(ClientInfoRequest clientInfoRequest) {
		try {
			ClientInfo clientInfo = clientInfoRepository.save(ClientUtils.convertToClienInfoEntity(clientInfoRequest));
			return new ClientInfoResponse(clientInfo.getId(), clientInfo.getClientSecret());
		} catch (Exception e) {
			return new ClientInfoResponse(new StatusInfo("1003", "Update Client Operation has Failed."));
		}
	}

}
