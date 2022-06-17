package com.acme.autorizzazioni.servizi.email;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author alber
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailService {
    private String nome;
    private String userNamePerInvio;
    private String password;
    
    
    public void send(Email mail) throws 
        MissingSubjectAndMessageException, 
        MailServerNotAvailableException, 
        AuthorizationFailureException, 
        EmailNotValidException {
        
        // se (l'email del destinatario non e' valida) lancia un eccezzione
        if(!isEmailValid(mail.getToSender())) {
            throw new EmailNotValidException("Email non valida");
        }
        
        if(mail.getMessage() == null || mail.getMessage().isBlank()) {
                
            if(mail.getSubject()==null  || mail.getSubject().isBlank()) {
                throw new MissingSubjectAndMessageException("Mancono sia il messaggio che l'oggetto della email");
            }
            
        }
        
        // controllo se le credenziali sono valide quando si vuole fare la connessione
        // per inviare l'email al server di stampa
        
        connectToServer();
        
        
        if (!isServerAvailable()) {
            throw new MailServerNotAvailableException("Il server è momentaneamente offline");
        }
        
        
        System.out.println("email: " +mail.getMessage() );
    }

    
    /**
     * @throws AuthorizationFailureException
     * supponiamo sia sempre connesso altrimenti genera un eccezione
     */
    public void connectToServer() throws AuthorizationFailureException {
        boolean connected = true;
        
        if(!connected) {
            throw new AuthorizationFailureException("Credenziali errate");
        } 
        
    }
    
    
    /**
     * @param email
     * @return supponiamo sia sempre valida
     */
    private boolean isEmailValid(String email) {
        return true;
    }
     /**
     * @return supponiamo il server sia sempre disponibile
     */
    private boolean isServerAvailable() {
        
        
        return true;
    }
}
