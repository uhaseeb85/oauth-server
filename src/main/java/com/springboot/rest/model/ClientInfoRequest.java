/**
 * 
 */
package com.springboot.rest.model;

/**
 * @author uhase
 *
 */
public class ClientInfoRequest {
	
	private String clientName;
	
	private String redirectUrl;
	
	private String clientContact;
	
	private String scope;
	
	private String destinationOrg;
	
	private Integer clientId;

	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * @return the redirectUrl
	 */
	public String getRedirectUrl() {
		return redirectUrl;
	}

	/**
	 * @param redirectUrl the redirectUrl to set
	 */
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	/**
	 * @return the clientContact
	 */
	public String getClientContact() {
		return clientContact;
	}

	/**
	 * @param clientContact the clientContact to set
	 */
	public void setClientContact(String clientContact) {
		this.clientContact = clientContact;
	}

	/**
	 * @return the scope
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * @param scope the scope to set
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}

	/**
	 * @return the destinationOrg
	 */
	public String getDestinationOrg() {
		return destinationOrg;
	}

	/**
	 * @param destinationOrg the destinationOrg to set
	 */
	public void setDestinationOrg(String destinationOrg) {
		this.destinationOrg = destinationOrg;
	}

	/**
	 * @return the clientId
	 */
	public Integer getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

}
