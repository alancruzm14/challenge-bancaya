/**
 * 
 */
package com.bankaya.challenge.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankaya.challenge.component.AuxComponent;
import com.bankaya.challenge.model.Pokemon;
import com.bankaya.challenge.model.mysql.Bitacora;
import com.bankaya.challenge.repository.BitacoraRepository;
import com.bankaya.challenge.repository.PokemonRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author macbook
 *
 */
@Service
@Slf4j
public class PokemonService {

	@Autowired
	private PokemonRepository pokemonRepository;

	/**
	 * Componente auxiliar
	 */
	@Autowired
	private AuxComponent auxComponent;

	/**
	 * Componente para guardar las bitacoras
	 */
	@Autowired
	private BitacoraRepository bitacoraRepository;

	/**
	 * Metodo para obtener el pokemon por nombre
	 * 
	 * @param name
	 * @return
	 */
	public Pokemon getPokemonByName(String name) {
		Pokemon pokemon = pokemonRepository.getPokemonByName(name);
		log.info("Pokemon: {}", auxComponent.getJsonByObj(pokemon));

		Bitacora bt = new Bitacora();
		bt.setIp(auxComponent.getIp());
		bt.setMethod("GET");
		bt.setDateRegister(LocalDateTime.now());
		bitacoraRepository.save(bt);

		return pokemon;
	}

}
