package com.acme.autorizzazioni.licenze;

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
@RequestMapping("licenza_caccia")  // http://localhost:8080/tesserino_caccia
public class LicenzaCacciaController {
	
	@Autowired
	private LicenzaRepo licenzaRepo;
	
	@GetMapping("/scadute")
	public void getTesseriniCacciaScaduti() {
		
		
		
	}
	
	@GetMapping
	public void getTesserinoCaccia() {
		
		licenzaRepo.findAll();
		
	}
	
	@PostMapping
	public void insertTesserinoCaccia( LicenzaCaccia licenzaCaccia) {
		
		licenzaRepo.save(licenzaCaccia);
		
	}
	
	@PutMapping("/{id}") 
	public void updateTesserinoCaccia(@RequestBody LicenzaCaccia licenzaCaccia, @PathVariable long id) {
		
		LicenzaCaccia licenzaCacciaDB = (LicenzaCaccia) licenzaRepo.findById(id).get(); // prendo le informazioni del tesserino al id associato
		
		BeanUtils.copyProperties(licenzaCaccia, licenzaCacciaDB); // le modifico con le nuove informazioni
		
		licenzaRepo.save(licenzaCacciaDB); // facciamo il commit dei cambiamenti che sono stati richiesti dal client
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteTesserinoCaccia(@PathVariable long id) {
		
		licenzaRepo.delete(licenzaRepo.findById(id).get());
		
	}
	
	
	

}
