package com.acme.autorizzazioni.tesserini;

import javax.persistence.Entity;

import com.acme.autorizzazioni.licenze.Licenza;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class TesserinoPesca extends TesserinoAbstract {

	@Builder
	public TesserinoPesca(long id, int annoValidita, Licenza licenza) {
		super(id, annoValidita, licenza);
		// TODO Auto-generated constructor stub
	}

}
