package com.acme.autorizzazioni.servizi.email;

public class Main {
	
//	viene fatto un main ogni volta che si vuole controllare il funzionamento dei servizi

	public static void main(String[] args) {
		// Usiamo il factory per recuperare un server a nostra scelta
		
		try {
			EmailService googleService = EmailServiceFactory.create(EmailServiceFactory.GOOGLE_EMAIL);
			
			
		
			
			
		} catch (AuthorizationFailureException e) {
			
			System.out.println("Contattare l'amministratore");
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		} finally {
			// chiudi connessione
		}
		
	}

}
