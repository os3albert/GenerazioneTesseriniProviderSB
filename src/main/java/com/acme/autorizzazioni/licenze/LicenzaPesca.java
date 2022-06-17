package com.acme.autorizzazioni.licenze;


import javax.persistence.Entity;
import javax.persistence.Table;

import com.acme.autorizzazioni.persone.Persona;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@Entity
@Table(name = "licenze_pesca")
public class LicenzaPesca extends LicenzaAbstract {
	private String tipo;  
	private String localita;
	
	public LicenzaPesca(long id, int numeroLicenza, int annoDiScadenza, Persona titolare, String tipo,
			String localita) {
		super(id, numeroLicenza, annoDiScadenza, titolare);
		this.tipo = tipo;
		this.localita = localita;
	}
	

}
