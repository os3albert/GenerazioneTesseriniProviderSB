package com.acme.autorizzazioni.citta;

import java.util.List;

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
@RequestMapping("/citta")
public class CittaController {
	
	@Autowired
	private CittaRepository cittaRepo;
	
	@GetMapping("/{citta}")
	public void getCitta() {}
	
	
	@PostMapping("/{citta}")
	public void insertCitta(@RequestBody Citta citta) {
		
		cittaRepo.save(citta);

	}
	@PutMapping("/citta")
	public void updateCitta(@RequestBody Citta city, @PathVariable long citta) {
		
		Citta cittaInDb = cittaRepo.findById(citta).get();
		BeanUtils.copyProperties(city, cittaInDb);
		
		cittaRepo.save(cittaInDb);
	}
	@DeleteMapping("/cittaId")
	public void deleteCitta(@PathVariable long cittaId) {
		
		cittaRepo.deleteById(cittaId);
	}
	
	public List<Citta> getTutteLeCitta(){
		
		return (List<Citta>) cittaRepo.findAll();
	}

}
