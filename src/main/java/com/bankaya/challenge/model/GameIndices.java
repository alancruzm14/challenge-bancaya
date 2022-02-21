package com.bankaya.challenge.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author macbook
 *
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameIndices implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty(value = "game_index")
	private int gameIndex;

	/**
	 * 
	 */
	private Version version;
}
