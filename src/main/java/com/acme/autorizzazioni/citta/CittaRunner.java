package com.acme.autorizzazioni.citta;

import java.util.Locale;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

@Component
public class CittaRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

			Faker fk = new Faker( new Locale("it-IT")   );

			for(int i=0; i<10; i++) {
				
		        Citta c =new Citta();
				
				c.setCitta(fk.address().cityName());
				c.setProvincia(fk.address().stateAbbr());
			}
		
	}

}
