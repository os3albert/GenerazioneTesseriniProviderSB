package com.acme.autorizzazioni.servizi.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class EnterpriseEmail extends EmailAbstract {

	public EnterpriseEmail(long id, String to, String message, String subject) {
		super(id, to, message, subject);
		// TODO Auto-generated constructor stub
	}

}
