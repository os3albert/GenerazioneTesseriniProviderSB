package com.acme.autorizzazioni.tesserini;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesserinoCacciaRepository extends PagingAndSortingRepository<TesserinoCaccia, Long> {

}
