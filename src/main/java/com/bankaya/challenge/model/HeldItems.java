/**
 * 
 */
package com.bankaya.challenge.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * @author macbook
 *
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeldItems implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Item item;

	@JsonProperty(value = "version_details")
	private List<VersionDetails> versionDetails;
	
	

}
