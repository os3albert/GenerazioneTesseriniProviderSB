package com.acme.autorizzazioni.tesserini;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import com.acme.autorizzazioni.licenze.Licenza;
import com.acme.autorizzazioni.licenze.LicenzaAbstract;
import com.acme.autorizzazioni.persone.Persona;
import com.acme.autorizzazioni.persone.PersonaAbstract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class TesserinoAbstract implements Tesserino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private int annoValidita;
	
	@ToString.Exclude
	@ManyToOne(targetEntity = LicenzaAbstract.class)
	private Licenza licenza;
	
	@ToString.Exclude
	@ManyToOne(targetEntity = PersonaAbstract.class)
	private Persona tesserini_persona;
	
}
