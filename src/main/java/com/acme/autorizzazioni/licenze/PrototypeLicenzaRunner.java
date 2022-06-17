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

	@Override
	public void run(ApplicationArguments args) throws Exception {

		for (int i = 0; i < 30; i++) {
			
			Licenza licenza = licenzaObjectProvider.getObject();
			System.out.println(licenza);
			
		}
		
	}

}
