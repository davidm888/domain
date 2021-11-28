package com.dma.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DomainController {

	@GetMapping("/healthCheck")
	public String healthCheck() {
		return "{version: 1.0.0, status: 'OK' }";
	}
	
	@PostMapping("/process-domain")
	public String processDomain() {
		return "processed";
	}
	
	@PostMapping("/process-client-domain")
	public String processClientDomain() {
		return "processed client domain";
	}
	
	@GetMapping("/validate-domain")
	public String validateDomain() {
		return "{dominio:\"bancolombia.com\", dominios_similares:[], dominios_sim_punycode:[]}";
	}

}
