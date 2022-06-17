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
public class LicenzaCaccia extends LicenzaAbstract {
	
	
	private String atc;
	private String numeroDiSerie; 
	private String tipologiaPrede;
	
	public LicenzaCaccia(long id, int numeroLicenza, int annoDiScadenza, Persona titolare, String atc,
			String numeroDiSerie, String tipologiaPrede) {
		super(id, numeroLicenza, annoDiScadenza, titolare);
		this.atc = atc;
		this.numeroDiSerie = numeroDiSerie;
		this.tipologiaPrede = tipologiaPrede;
	}
	
	
	

}
