package com.acme.autorizzazioni.licenze.titolari;

import javax.persistence.Entity;

import com.acme.autorizzazioni.persone.PersonaAbstract;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@Entity
public class TitolareLicenza extends PersonaAbstract {

	

}
