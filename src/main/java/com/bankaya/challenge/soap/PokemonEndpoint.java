/**
 * 
 */
package com.bankaya.challenge.soap;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.baeldung.springsoap.gen.Ability;
import com.baeldung.springsoap.gen.GetPokemonRequest;
import com.baeldung.springsoap.gen.GetPokemonResponse;
import com.baeldung.springsoap.gen.Item;
import com.baeldung.springsoap.gen.Version;
import com.bankaya.challenge.component.AuxComponent;
import com.bankaya.challenge.model.Pokemon;
import com.bankaya.challenge.model.VersionDetails;
import com.bankaya.challenge.model.mysql.Bitacora;
import com.bankaya.challenge.repository.BitacoraRepository;
import com.bankaya.challenge.repository.PokemonRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * Clase para la exposicion del svc soap
 * 
 * @author macbook
 *
 */
@Endpoint
@Slf4j
public class PokemonEndpoint {

	private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";

	/**
	 * Componente tipo repositorio
	 */
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
	 * Metodo para consultar el nombre por servicio SOAP
	 * 
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonRequest")
	@ResponsePayload
	public GetPokemonResponse getPokemon(@RequestPayload GetPokemonRequest request) {
		log.info(":: Execute getPokemon ::");
		GetPokemonResponse response = new GetPokemonResponse();

		// Consulta Rest
		Pokemon pokemonResponseRest = pokemonRepository.getPokemonByName(request.getName());

		// Llenado de bean soap
		com.baeldung.springsoap.gen.Pokemon pokeSoap = new com.baeldung.springsoap.gen.Pokemon();
		BeanUtils.copyProperties(pokemonResponseRest, pokeSoap);
		setAbilities(pokemonResponseRest.getAbilities(), pokeSoap.getAbilities());
		setHeldItems(pokemonResponseRest.getHeldItems(), pokeSoap.getHeldItems());

		// Llenado de Response Final
		response.setPokemon(pokeSoap);

		saveBitacora(request.getName());
		log.info(":: Finally getPokemon ::");
		return response;
	}

	/**
	 * Metodo para llenar las habilidades de los pokemon
	 * 
	 * @param listaAbilityRest
	 * @param abilitiesSoap
	 */
	private void setAbilities(List<com.bankaya.challenge.model.Abilities> listaAbilityRest,
			List<com.baeldung.springsoap.gen.Pokemon.Abilities> abilitiesSoap) {

		if (listaAbilityRest != null && !listaAbilityRest.isEmpty()) {
			for (com.bankaya.challenge.model.Abilities abRest : listaAbilityRest) {
				com.baeldung.springsoap.gen.Pokemon.Abilities abSoap = new com.baeldung.springsoap.gen.Pokemon.Abilities();
				BeanUtils.copyProperties(abRest, abSoap);
				Ability abilSoap = new Ability();
				BeanUtils.copyProperties(abRest.getAbility(), abilSoap);
				abSoap.setAbility(abilSoap);

				abilitiesSoap.add(abSoap);
			}
		}
	}

	/**
	 * Metodo para agregar los items
	 * 
	 * @param listaHeldItemsRest
	 * @param heldItemsSoap
	 */
	private void setHeldItems(List<com.bankaya.challenge.model.HeldItems> listaHeldItemsRest,
			List<com.baeldung.springsoap.gen.Pokemon.HeldItems> heldItemsSoap) {

		if (listaHeldItemsRest != null && !listaHeldItemsRest.isEmpty()) {

			for (com.bankaya.challenge.model.HeldItems heRest : listaHeldItemsRest) {
				com.baeldung.springsoap.gen.Pokemon.HeldItems heSoap = new com.baeldung.springsoap.gen.Pokemon.HeldItems();
				Item itSoap = new Item();
				BeanUtils.copyProperties(heRest.getItem(), itSoap);
				heSoap.setItem(itSoap);
				setVersionDetails(heRest.getVersionDetails(), heSoap.getVersionDetails());

				heldItemsSoap.add(heSoap);
			}
		}

	}

	/**
	 * Metodo para
	 * 
	 * @param listVersionRest
	 * @param listVersionSoap
	 */
	private void setVersionDetails(List<VersionDetails> listVersionRest,
			List<com.baeldung.springsoap.gen.Pokemon.HeldItems.VersionDetails> listVersionSoap) {

		if (listVersionRest != null && !listVersionRest.isEmpty()) {

			for (VersionDetails versRest : listVersionRest) {
				com.baeldung.springsoap.gen.Pokemon.HeldItems.VersionDetails versDetSoap = new com.baeldung.springsoap.gen.Pokemon.HeldItems.VersionDetails();

				BeanUtils.copyProperties(versRest, versDetSoap);
				Version verSoap = new Version();
				BeanUtils.copyProperties(versRest.getVersion(), verSoap);
				versDetSoap.setVersion(verSoap);

				listVersionSoap.add(versDetSoap);
			}

		}

	}

	/**
	 * Metodo para guardar en bitacora
	 */
	private void saveBitacora(String name) {
		Bitacora bt = new Bitacora();
		bt.setIp(auxComponent.getIp());
		bt.setMethod("Find by ".concat(name));
		bt.setDateRegister(LocalDateTime.now());
		bitacoraRepository.save(bt);
	}

}