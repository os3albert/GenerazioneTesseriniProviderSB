package com.acme.autorizzazioni.licenze;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.acme.autorizzazioni.persone.Persona;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class LicenzaAbstract implements Licenza {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private int numeroLicenza;
	private Persona titolare;
	private int annoDiScadenza;
	@Override
	public boolean isValid() {
		return true;
	}		
	
}
