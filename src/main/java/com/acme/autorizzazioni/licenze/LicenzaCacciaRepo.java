package com.acme.autorizzazioni.licenze;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenzaCacciaRepo extends PagingAndSortingRepository<LicenzaAbstract, Long> {

}
