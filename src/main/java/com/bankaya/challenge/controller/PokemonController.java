/**
 * 
 */
package com.bankaya.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bankaya.challenge.service.PokemonService;

/**
 * @author macbook
 *
 */
@RestController
@RequestMapping("/api/v1/pokemon")
public class PokemonController {

	/**
	 * 
	 */
	@Autowired
	private PokemonService pokemonService;

	/**
	 * 
	 * @param namePokemon
	 * @return
	 */
	@GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> testRest(@RequestParam String namePokemon) {

		return new ResponseEntity<>(pokemonService.getPokemonByName(namePokemon), HttpStatus.OK);
	}

}
