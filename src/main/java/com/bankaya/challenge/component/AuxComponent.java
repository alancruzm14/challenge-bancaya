package com.bankaya.challenge.component;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import lombok.extern.slf4j.Slf4j;

/**
 * Componente de conversion de datos
 * 
 * @author macbook
 *
 */
@Component
@Slf4j
public class AuxComponent {

	/**
	 * Metodo para convertir objs a json
	 * 
	 * @param object
	 * @return
	 */
	public String getJsonByObj(Object object) {
		String json = "";
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		try {
			json = ow.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			log.error(e.getLocalizedMessage());
		}
		return json;
	}

	
	/**
	 * Metodo para obtener la ip
	 * 
	 * @return
	 */
	public String getIp() {
		String ip = "";
		try {
			ip = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			log.error("Error con la IP: ", e);
		}
		return ip;
	}

}
