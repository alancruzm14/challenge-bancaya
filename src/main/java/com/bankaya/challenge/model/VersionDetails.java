/**
 * 
 */
package com.bankaya.challenge.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * @author macbook
 *
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class VersionDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int rarity;
	
	private Version version;
	
	
}
