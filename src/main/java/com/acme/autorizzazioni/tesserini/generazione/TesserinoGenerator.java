package com.acme.autorizzazioni.tesserini.generazione;

import java.util.ArrayList;
import java.util.List;

import com.acme.autorizzazioni.licenze.Licenza;
import com.acme.autorizzazioni.licenze.LicenzaScadutaException;
import com.acme.autorizzazioni.tesserini.Tesserino;
import com.acme.autorizzazioni.tesserini.TesserinoCaccia;
import com.acme.autorizzazioni.tesserini.TesserinoPesca;

public class TesserinoGenerator {
	public final static int ANNO_IN_CORSO = 2022;

//	public static Tesserino generate(Licenza licenza) throws LicenzaScadutaException {
//		if(!licenza.isValid()) {
//			throw new LicenzaScadutaException("La licenza di " + licenza.getTitolare().getCognome()+ " è scaduta");
//		}
//		Tesserino tesserino = null;
//		
//		if(licenza.getClass().getSimpleName().equals("LicenzaCaccia")) {
//			tesserino = new TesserinoCaccia(ANNO_IN_CORSO, licenza);
//			
//		} else {
//			tesserino = new TesserinoPesca(ANNO_IN_CORSO, licenza);
//		}
//		
//		return tesserino;
//		
//	}
//	
//	 v prof
	public static void generate(Licenza licenza) throws LicenzaScadutaException {
		if (!licenza.isValid()) {
			throw new LicenzaScadutaException("La licenza di " + licenza.getTitolare().getCognome() + " è scaduta");
		}
		Tesserino tesserino = null;

		if (licenza.getClass().getSimpleName().equals("LicenzaCaccia")) {
//			tesserino = new TesserinoCaccia(ANNO_IN_CORSO, licenza);

		} else {
//			tesserino = new TesserinoPesca(ANNO_IN_CORSO, licenza);
		}

	}

//	 v prof
	public static void generate(List<Licenza> licenze) throws LicenzaScadutaException {

		for (Licenza licenza : licenze) {

			generate(licenza);

		}

	}

//	public static List<Tesserino> generate(List<Licenza> licenze) throws LicenzaScadutaException {
//
//		List<Tesserino> tesserinosList = new ArrayList<Tesserino>();
//
//		for (Licenza licenza : licenze) {
//
//			tesserinosList.add(generate(licenza));
//
//		}
//
//		return tesserinosList;
//	}

	// v2 stampa direttamente qui le informazioni del tesserino
//	public static void generate(Licenza licenza) throws LicenzaScadutaException {
//		if (!licenza.isValid()) {
//			throw new LicenzaScadutaException("La licenza di " + licenza.getTitolare().getCognome() + " è scaduta");
//		}
//		Tesserino tesserino = null;
//
//		if (licenza.getClass().getSimpleName().equals("LicenzaCaccia")) {
//
//			tesserino = new TesserinoCaccia(ANNO_IN_CORSO, licenza);
//			System.out.println(
//					" durata: " + tesserino.getAnnoValidita() + " titolare: " + tesserino.getLicenza().getTitolare()
//							+ " scade il: " + tesserino.getLicenza().getAnnoDiScadenza());
//
//		} else {
//			tesserino = new TesserinoPesca(ANNO_IN_CORSO, licenza);
//		}
//
//	}
//
//	// v2 stampa direttamente qui
//	public static void generate(List<Licenza> licenze) throws LicenzaScadutaException {
//
//		for (Licenza licenza : licenze) {
//
//			generate(licenza);
//
//		}
//
//	}

}
