package com.acme.autorizzazioni.servizi.email;

public interface Email {

	boolean equals(java.lang.Object o);

	long getId();

	String getMessage();

	String getSubject();

	String getToSender();

	int hashCode();

	void setId(long id);

	void setMessage(String message);

	void setSubject(String subject);

	void setToSender(String toSender);

	java.lang.String toString();

}