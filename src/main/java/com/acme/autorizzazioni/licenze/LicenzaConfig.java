package com.acme.autorizzazioni.licenze;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;

@Configuration
public class LicenzaConfig {
	
	private static final Faker faker = new Faker( new Locale("it-IT"));
	
	
	
	@Bean("licenzaCaccia")
	@Scope("prototype")
	public Licenza newLicenza() {
		
		LicenzaCaccia licenza = new LicenzaCaccia();
		
		licenza.setAtc(Faker.instance().bothify("???###??##??##"));
		licenza.setNumeroDiSerie(Faker.instance().bothify("???###??##??##"));
		licenza.setTipologiaPrede(faker.animal().name());
		licenza.setAnnoDiScadenza(Faker.instance().number().numberBetween(2000, 2050));
		licenza.setNumeroLicenza(faker.number().randomDigitNotZero());
		
		
		return licenza;
		
	}
	
	@Bean("licenzaPesca")
	@Scope("prototype")
	public Licenza newLicenzaPesca() {
		
		LicenzaPesca licenza = new LicenzaPesca();
		licenza.setAnnoDiScadenza(Faker.instance().number().numberBetween(2000, 2050));
		licenza.setNumeroLicenza(Faker.instance().number().randomDigitNotZero());
		licenza.setLocalita(Faker.instance().address().city());
		
		return licenza;
		
	}

}
