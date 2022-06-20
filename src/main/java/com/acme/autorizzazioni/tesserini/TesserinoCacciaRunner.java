package com.acme.autorizzazioni.tesserini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

@Component
public class TesserinoCacciaRunner implements ApplicationRunner {
	
	@Autowired
	private TesserinoCacciaRepository tesserinoCacciaRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		for (int i = 0; i < 10 ; i++) {
			
			TesserinoCaccia tesserinoCaccia = new TesserinoCaccia();
			tesserinoCaccia.setAnnoValidita(Faker.instance().number().randomDigit());
			tesserinoCacciaRepository.save(tesserinoCaccia);
		}

	}

}
