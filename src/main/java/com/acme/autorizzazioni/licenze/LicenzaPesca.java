package com.acme.autorizzazioni.licenze;


import javax.persistence.Entity;

import com.acme.autorizzazioni.persone.Persona;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@Entity
public class LicenzaPesca extends LicenzaAbstract {
	private String tipo;  
	private String localita;
	
	public LicenzaPesca(long id, int numeroLicenza, Persona titolare, int annoDiScadenza, String tipo,
			String localita) {
		super(id, numeroLicenza, titolare, annoDiScadenza);
		this.tipo = tipo;
		this.localita = localita;
	}

}
