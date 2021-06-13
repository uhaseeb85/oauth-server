package com.springboot.rest.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ClientInfoResponse {
	
	/**
	 * @param clientId
	 * @param clientSecret
	 */
	public ClientInfoResponse(String clientId, String clientSecret) {
		super();
		this.clientId = clientId;
		this.clientSecret = clientSecret;
	}

	/**
	 * @param error
	 */
	public ClientInfoResponse(StatusInfo status) {
		super();
		this.status = status;
	}

	private String clientId;
	
	private String clientSecret;
	
	private StatusInfo status;

	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the clientSecret
	 */
	public String getClientSecret() {
		return clientSecret;
	}

	/**
	 * @param clientSecret the clientSecret to set
	 */
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	/**
	 * @return the status
	 */
	public StatusInfo getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(StatusInfo status) {
		this.status = status;
	}

}
