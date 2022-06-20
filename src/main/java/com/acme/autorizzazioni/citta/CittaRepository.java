package com.acme.autorizzazioni.citta;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CittaRepository extends PagingAndSortingRepository<Citta, Long> {
    public List<Citta> findByIdBetween(long da, long a);
}
