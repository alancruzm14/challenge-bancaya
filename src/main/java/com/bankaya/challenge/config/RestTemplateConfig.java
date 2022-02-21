/**
 * 
 */
package com.bankaya.challenge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author macbook
 *
 */
@Configuration
public class RestTemplateConfig {

	/**
	 * Bean de RestTemplate
	 * 
	 * @return
	 */
	@Bean("restTemplate")
	@Scope("singleton")
	public RestTemplate restTemplate() {
		RestTemplate template = new RestTemplate();
		SimpleClientHttpRequestFactory rf = (SimpleClientHttpRequestFactory) template.getRequestFactory();
		return template;
	}

}
