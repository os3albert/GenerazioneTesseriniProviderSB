package com.acme.autorizzazioni.tesserini;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PrototypeTesserinoRunner implements ApplicationRunner {
	
	@Autowired
	@Qualifier("")
	ObjectProvider<Tesserino> objectProvider;
	
	
	

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub

	}

}
