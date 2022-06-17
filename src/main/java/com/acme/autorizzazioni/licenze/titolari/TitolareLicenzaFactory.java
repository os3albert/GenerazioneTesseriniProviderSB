package com.acme.autorizzazioni.licenze.titolari;

import com.acme.autorizzazioni.licenze.WrongPersonTypeException;
import com.acme.autorizzazioni.persone.Persona;

/**
 * @author alber
 * e sempre buona norma demandare la costruzioni di oggetti per il fatto della singola responsabilita
 */
public class TitolareLicenzaFactory {
	
	public final static int TITOLARE_LICENZA = 1;
	
	public final static TitolareLicenza create (int tipoTitolare) throws WrongPersonTypeException {
		Persona persona = null;
		
		
		if(tipoTitolare == TITOLARE_LICENZA) {
			persona = new TitolareLicenza();
		} else {
			throw new WrongPersonTypeException("Tipo persona non previsto");
		}
		
		return (TitolareLicenza) persona; 	// classe padre -> classe figlia ci vuole sempre il cast
        									// classe figlia -> classe padre il cast viene fatto in automatico
		
		
	}
	
	public final static TitolareLicenza create() throws WrongPersonTypeException {
		return create(TITOLARE_LICENZA);
	}
	
	public final static TitolareLicenza create(int tipoTitolare, String nome, String cognome, String indirizzo, 
			String email, String cap, String citta) throws WrongPersonTypeException {
		Persona persona =  create(tipoTitolare);
		
		persona.setNome(nome);
		persona.setCognome(cognome);
		persona.setEmail(email);
		persona.setIndirizzo(indirizzo);
		persona.setCitta(citta);
		persona.setCap(cap);
		
		return (TitolareLicenza) persona;
	}
}
