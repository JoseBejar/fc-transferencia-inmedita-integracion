package org.fmbbva.movcli.fc.transferencia.inmediata.api.dto;

import org.fmbbva.movcli.fc.transferencia.inmediata.api.consulta.dto.AV2Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultaCuentaAV2RequestDto {
	
   @JsonProperty("AV2")
   private AV2Dto av2Dto;

   public ConsultaCuentaAV2RequestDto() {
	super();
   }

   public ConsultaCuentaAV2RequestDto(AV2Dto av2Dto) {
	super();
	this.av2Dto = av2Dto;
   }

   public AV2Dto getAv2Dto() {
	return av2Dto;
   }

   public void setAv2Dto(AV2Dto av2Dto) {
	this.av2Dto = av2Dto;
   }
   
   
   
	
}
