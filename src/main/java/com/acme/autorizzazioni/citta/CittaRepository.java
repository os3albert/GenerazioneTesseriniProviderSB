package com.acme.autorizzazioni.citta;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CittaRepository extends PagingAndSortingRepository<Citta, Long> {
	
	public List<Citta> findByNome(String nome);
	
	public List<Citta> findByIdBetween(long da, long a);
	
	public List<Citta> findByIdGreaterThan(long id);

	public List<Citta> findByNomeStartingWithIgnoreCase(String nome);  // con ignoreCase ignori il fatto che inizi o meno con la lettera maiuscola
	
	public List<Citta> findByNomeEndingWithIgnoreCase(String nome); 

    public List<Citta> findByNomeContainingIgnoreCase(String nome); 
    
    public List<Citta> findByNomeStartingWithIgnoreCaseAndCognomeContainingIgnoreCase(String nome, String cognome); 
    
    public List<Citta> findByNomeIsNotIgnoreCase(String nome); 

}
