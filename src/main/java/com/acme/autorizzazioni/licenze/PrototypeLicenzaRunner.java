package com.acme.autorizzazioni.licenze;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PrototypeLicenzaRunner implements ApplicationRunner {
	
	@Autowired
	@Qualifier("licenzaCaccia")
	ObjectProvider<Licenza> licenzaObjectProvider;
	
	@Autowired
	LicenzaCacciaRepo licenzaCacciaRepo;
	
	
	@Autowired
	@Qualifier("licenzaPesca")
	ObjectProvider<Licenza> licenzaPescaObjectProvider;
	

	@Override
	public void run(ApplicationArguments args) throws Exception {

		for (int i = 0; i < 30; i++) {
			
			LicenzaCaccia licenza = (LicenzaCaccia) licenzaObjectProvider.getObject(); // prende un prototipo di oggetto
			
			licenzaCacciaRepo.save(licenza); //salva l'oggetto creato al interno del database
			
			
		}
		
	}

}
