package com.dma.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dma.domain.dto.DomainRequestDTO;
import com.dma.domain.service.DomainService;

@RestController()
public class DomainController {

	@Autowired
	DomainService domainService;
	
	@GetMapping("/healthCheck")
	public String healthCheck() {
		return domainService.healthCheck();
	}
	
	@PostMapping("/process-client-domain")
	public String processClientDomain(@RequestBody DomainRequestDTO domainRequestDTO) {
		return domainService.processClientDomain(domainRequestDTO);
	}
	
	@PostMapping("/validate-domain")
	public String validateDomain(@RequestBody DomainRequestDTO domainRequestDTO) {
		return domainService.validateDomain(domainRequestDTO);
	}

}
