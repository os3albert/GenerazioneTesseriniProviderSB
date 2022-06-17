package com.acme.autorizzazioni.servizi.email;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Entity
@Table(name = "enterprise_emails")
public class EnterpriseEmail extends EmailAbstract {

	public EnterpriseEmail(long id, String toSender, String message, String subject) {
		super(id, toSender, message, subject); 
		// TODO Auto-generated constructor stub
	}

}
