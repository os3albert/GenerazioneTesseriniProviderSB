package com.acme.autorizzazioni.tesserini;

import javax.persistence.Entity;

import com.acme.autorizzazioni.licenze.Licenza;
import com.acme.autorizzazioni.persone.Persona;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class TesserinoCaccia extends TesserinoAbstract {
	
	@Builder
	public TesserinoCaccia(long id, int annoValidita, Licenza licenza, Persona tesserini_persona) {
		super(id, annoValidita, licenza, tesserini_persona);
		// TODO Auto-generated constructor stub
	}

	
	

}
