/**
 * 
 */
package com.springboot.rest.utils;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.rest.dao.ClientInfo;
import com.springboot.rest.dao.ClientInfoRepository;
import com.springboot.rest.model.ClientInfoRequest;

// TODO: Auto-generated Javadoc
/**
 * The Class ClientUtils.
 *
 * @author uhase
 */
public class ClientUtils {

	/**
	 * Convert to clien info entity.
	 *
	 * @param clientInfoRequest the client info request
	 * @return the client info
	 */
	public static ClientInfo convertToClienInfoEntity(ClientInfoRequest clientInfoRequest) {
		ClientInfo clientInfo = new ClientInfo(clientInfoRequest.getClientName(), clientInfoRequest.getRedirectUrl(),
				clientInfoRequest.getClientContact(), clientInfoRequest.getScope(),
				clientInfoRequest.getDestinationOrg(), UUID.randomUUID().toString());
		clientInfo.setId(clientInfoRequest.getClientName()+"-"+UUID.randomUUID().toString());
		return clientInfo;
	}

}
