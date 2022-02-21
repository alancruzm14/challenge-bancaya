/**
 * 
 */
package com.bankaya.challenge.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.bankaya.challenge.model.Pokemon;

import lombok.extern.slf4j.Slf4j;

/**
 * @author macbook
 *
 */
@Repository
@Slf4j
public class PokemonRepository {

	/**
	 * Componente de rest template
	 */
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * Atributo de url para el endpoint de api pokemon
	 */
	@Value("${pokemon.api}")
	private String urlPokemonApi;

	/**
	 * 
	 * @param namePokemon
	 * @return
	 */
	public Pokemon getPokemonByName(String namePokemon) {
		log.info("Find by name: {}", namePokemon);
		Pokemon pokemonResponse = null;

		String uri = urlPokemonApi.concat(namePokemon);

		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Application");
		HttpEntity<String> entity = new HttpEntity<>(headers);
		pokemonResponse = restTemplate.exchange(uri, HttpMethod.GET, entity, Pokemon.class).getBody();

		return pokemonResponse;

	}

}
