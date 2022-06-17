package com.acme.autorizzazioni.persone;

import java.util.List;

import com.acme.autorizzazioni.licenze.Licenza;
import com.acme.autorizzazioni.tesserini.Tesserino;

public interface Persona {

	String getCap();

	String getCitta();

	String getCognome();

	String getEmail();

	String getIndirizzo();

	String getNome();

	void setCap(String cap);

	void setCitta(String citta);

	void setCognome(String cognome);

	void setEmail(String email);

	void setIndirizzo(String indirizzo);

	void setNome(String nome);
	
	public List<Tesserino> getTesserinos();

	public void setTesserinos(List<Tesserino> tesserinos);

	public List<Licenza> getLicenzas();


	public void setLicenzas(List<Licenza> licenzas);


}