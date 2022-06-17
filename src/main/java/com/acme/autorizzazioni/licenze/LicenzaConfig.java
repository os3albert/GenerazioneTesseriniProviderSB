package com.acme.autorizzazioni.licenze;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;

@Configuration
public class LicenzaConfig {
	
	
	
	@Bean("licenzaCaccia")
	@Scope("prototype")
	public Licenza newLicenzaCaccia() {
		
		Licenza licenza = new LicenzaCaccia();
		licenza.setAnnoDiScadenza(Faker.instance().number().numberBetween(2000, 2050));
		licenza.setNumeroLicenza(Faker.instance().number().randomDigitNotZero());
		
		return licenza;
		
	}
	
	@Bean("licenzaPesca")
	@Scope("prototype")
	public Licenza newLicenzaPesca() {
		
		Licenza licenza = new LicenzaCaccia();
		licenza.setAnnoDiScadenza(Faker.instance().number().numberBetween(2000, 2050));
		licenza.setNumeroLicenza(Faker.instance().number().randomDigitNotZero());
		
		return licenza;
		
	}

}
