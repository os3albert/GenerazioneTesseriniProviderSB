package com.acme.autorizzazioni.tesserini;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tesserino_caccia")  // http://localhost:8080/tesserino_caccia
public class TesserinoCacciaController {
	
	@Autowired
	private TesserinoCacciaRepository tesserinoCacciaRepository;
	
	@GetMapping("/scaduti")
	public void getTesseriniCacciaScaduti() {
		
		
		
	}
	
	@GetMapping
	public void getTesserinoCaccia() {
		
		tesserinoCacciaRepository.findAll();
		
	}
	
	@PostMapping
	public void insertTesserinoCaccia( TesserinoCaccia tesserinoCaccia) {
		
		tesserinoCacciaRepository.save(tesserinoCaccia);
		
	}
	
	@PutMapping("/{id}")
	public void updateTesserinoCaccia(@RequestBody TesserinoCaccia tesserinoCaccia, @PathVariable long id) {
		
		TesserinoCaccia tesserinoCacciaDB = tesserinoCacciaRepository.findById(id).get(); // prendo le informazioni del tesserino al id associato
		
		BeanUtils.copyProperties(tesserinoCaccia, tesserinoCacciaDB); // le modifico con le nuove informazioni
		
		tesserinoCacciaRepository.save(tesserinoCacciaDB); // facciamo il commit dei cambiamenti che sono stati richiesti dal client
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteTesserinoCaccia(@PathVariable long id) {
		
		tesserinoCacciaRepository.delete(tesserinoCacciaRepository.findById(id).get());
		
	}
	
	
	

}
