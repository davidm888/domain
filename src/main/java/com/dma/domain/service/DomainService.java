package com.dma.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dma.domain.dto.DomainRequestDTO;
import com.dma.domain.dto.DomainResponseDTO;
import com.dma.domain.dto.HealthCheckResponseDTO;
import com.dma.domain.dto.ValidateResponseDTO;
import com.google.gson.Gson;

@Service
public class DomainService {

	@Autowired
	Gson gson;
	
	public String healthCheck() {
		HealthCheckResponseDTO response = new HealthCheckResponseDTO.Builder("OK").withVersion("1.0.0").build();
		return gson.toJson(response);
	}
	
	public String processClientDomain(DomainRequestDTO domainRequestDTO) {
		DomainResponseDTO response = new DomainResponseDTO.Builder("processing the result will be sent to the mail").build();
		return gson.toJson(response);
	}
	
	public String validateDomain(DomainRequestDTO domainRequestDTO) {
		ValidateResponseDTO response = new ValidateResponseDTO.Builder("bancolombia.com").build();
		return gson.toJson(response);
	}
}
