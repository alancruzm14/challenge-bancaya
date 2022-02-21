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
public class Version implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6721762445307977734L;

	private String name;

	private String url;

}
