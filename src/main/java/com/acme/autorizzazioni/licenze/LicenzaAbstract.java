package com.acme.autorizzazioni.licenze;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.acme.autorizzazioni.persone.Persona;
import com.acme.autorizzazioni.persone.PersonaAbstract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "licenze")
public abstract class LicenzaAbstract implements Licenza {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private int numeroLicenza;
	private int annoDiScadenza;
	
	@ToString.Exclude
	@ManyToOne(targetEntity = PersonaAbstract.class)
	private Persona titolare;
	
	@Override
	public boolean isValid() {
		return true;
	}		
	
}
