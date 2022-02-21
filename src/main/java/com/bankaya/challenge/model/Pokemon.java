/**
 * 
 */
package com.bankaya.challenge.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author macbook
 *
 */
@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon implements Serializable {

	/**
	 * Id default de serializacion
	 */
	private static final long serialVersionUID = 5571596972242775621L;

	/**
	 * 
	 */
	private List<Abilities> abilities;

	/**
	 * 
	 */
	@JsonProperty(value = "base_experience")
	private int baseExperience;

	/**
	 * 
	 */
	private List<Forms> forms;

	/**
	 * 
	 */
	@JsonProperty(value = "game_indices")
	private List<GameIndices> gameIndices;

	/**
	 * 
	 */
	private int height;

	/**
	 * 
	 */
	@JsonProperty(value = "held_items")
	private List<HeldItems> heldItems;

	/**
	 * 
	 */
	private int id;

	/**
	 * 
	 */
	@JsonProperty(value = "is_default")
	private boolean isDefault;

	/**
	 * 
	 */
	@JsonProperty(value = "location_area_encounters")
	private String locationAreaEncounters;

	/**
	 * 
	 */
	private String name;

}
