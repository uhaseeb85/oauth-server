/**
 * 
 */
package com.springboot.rest.model;

/**
 * @author uhase
 *
 */
public class StatusInfo {
	
	/**
	 * @param statusCode
	 * @param statusDescription
	 */
	public StatusInfo(String statusCode, String statusDescription) {
		super();
		this.statusCode = statusCode;
		this.statusDescription = statusDescription;
	}

	private String statusCode;
	
	private String statusDescription;

	/**
	 * @return the statusCode
	 */
	public String getstatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setstatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the statusDescription
	 */
	public String getstatusDescription() {
		return statusDescription;
	}

	/**
	 * @param statusDescription the statusDescription to set
	 */
	public void setstatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

}
