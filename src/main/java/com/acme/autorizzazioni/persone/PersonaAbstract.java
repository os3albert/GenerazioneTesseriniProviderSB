package com.acme.autorizzazioni.persone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringExclude;

import com.acme.autorizzazioni.licenze.Licenza;
import com.acme.autorizzazioni.licenze.LicenzaAbstract;
import com.acme.autorizzazioni.tesserini.Tesserino;
import com.acme.autorizzazioni.tesserini.TesserinoAbstract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "persona")
public abstract class PersonaAbstract implements Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String email;
	private String nome; 
	private String cognome;
	private String indirizzo;
	private String cap; 
	private String citta; 
	
	@ToString.Exclude
	@OneToMany(targetEntity = TesserinoAbstract.class)
	private List<Tesserino> tesserinos;
	
	@ToString.Exclude
	@OneToMany(targetEntity = LicenzaAbstract.class)
	private List<Licenza> licenzas;
}
