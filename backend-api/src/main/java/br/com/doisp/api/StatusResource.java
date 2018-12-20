package br.com.doisp.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.doisp.backend.model.StatusReponse;

@RestController
@RequestMapping(value = "/api/status", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class StatusResource {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(StatusResource.class);
	
	@GetMapping
	public ResponseEntity<StatusReponse> status() {
		LOGGER.debug("Status request.");
		return ResponseEntity.ok().body(new StatusReponse());
	}

}