/**
 * 
 */
package com.bankaya.challenge.model;

import java.io.Serializable;

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
public class Abilities implements Serializable {

	/**
	 * Id default de serializacion
	 */
	private static final long serialVersionUID = 883204711143294568L;

	/**
	 * 
	 */
	private Ability ability;
	
	@JsonProperty(value = "is_hidden")
	private boolean isHidden;
	
	private int slot;

}
