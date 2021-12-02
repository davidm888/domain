package com.dma.domain.dto;


public class DomainResponseDTO {
	
	private String message;
	
	public static  class Builder {
		private String message;
		
		public Builder(String message) {
            this.message = message;
        }
		
		public DomainResponseDTO build() {
			DomainResponseDTO domainResponseDTO = new DomainResponseDTO();
            domainResponseDTO.setMessage(message);
            return domainResponseDTO;
		}

	}
	
	private DomainResponseDTO () {}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
