package com.acme.autorizzazioni.tesserini;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

@Component
public class TesserinoConfiguration{
	
	private static final String CACCIA = "caccia";
	private static final String PESCA = "pesca";

	@Bean
	@Scope("prototype")
	public Tesserino newTesserino(String tesserinoType) throws WrongTesserinoTypeException {
		
		if(tesserinoType.equals(CACCIA)) 
			return TesserinoCaccia.builder()
								  .annoValidita(Faker.instance().number().numberBetween(2000, 2050))
								  .build();
		
		else if (tesserinoType.equals(PESCA))
			return TesserinoPesca.builder()
								 .annoValidita(Faker.instance().number().numberBetween(2000, 2050))
								 .build();
		
		else throw new WrongTesserinoTypeException("wrong tesserino type added");
		
	}

}
