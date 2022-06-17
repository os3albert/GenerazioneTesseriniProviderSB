package com.acme.autorizzazioni.licenze;

import com.acme.autorizzazioni.persone.Persona;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
public class LicenzaCaccia extends LicenzaAbstract {
	
	
	private long id;
	private String atc;
	private String numeroDiSerie; 
	private String tipologiaPrede;
	
	
	public LicenzaCaccia(long id, int numeroLicenza, Persona titolare, int annoDiScadenza, long id2, String atc,
			String numeroDiSerie, String tipologiaPrede) {
		super(id, numeroLicenza, titolare, annoDiScadenza);
		id = id2;
		this.atc = atc;
		this.numeroDiSerie = numeroDiSerie;
		this.tipologiaPrede = tipologiaPrede;
	}
	
	

}
