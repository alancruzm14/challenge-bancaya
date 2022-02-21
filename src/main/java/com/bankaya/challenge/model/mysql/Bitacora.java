/**
 * 
 */
package com.bankaya.challenge.model.mysql;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author macbook
 *
 */
@Getter
@Setter
@Entity
@Table(name = "Bitacora", schema = "ChallengeDb")
public class Bitacora implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5818588529796134106L;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	/**
	 * 
	 */
	private String ip;

	/**
	 * 
	 */
	private LocalDateTime dateRegister;

	/**
	 * 
	 */
	private String method;

}
