package dd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	
	

@Entity
@Table(name = "GREEN_UTENTI")
public class Green_Utenti {
@Id
@Column(name = "UTENTE_ID")
private long utenteId;
@Column(name = "NOME")
private String nome;
@Column(name = "COGNOME")
private String cognome;
@Column(name = "EMAIL")
private long email;
@Column(name = "USER ID")
private String userId;
@Column(name = "AFFIDABILITA")
private String affidabilita;
public long getUtenteId() {
	return utenteId;
}
public void setUtenteId(long utenteId) {
	this.utenteId = utenteId;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCognome() {
	return cognome;
}
public void setCognome(String cognome) {
	this.cognome = cognome;
}
public long getEmail() {
	return email;
}
public void setEmail(long email) {
	this.email = email;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getAffidabilita() {
	return affidabilita;
}
public void setAffidabilita(String affidabilita) {
	this.affidabilita = affidabilita;
}
public Green_Utenti(long utenteId, String nome, String cognome, long email, String userId, String affidabilita) {
	super();
	this.utenteId = utenteId;
	this.nome = nome;
	this.cognome = cognome;
	this.email = email;
	this.userId = userId;
	this.affidabilita = affidabilita;
}
public Green_Utenti() {
	super();
}
@Override
public String toString() {
	return "Green_Utenti [utenteId=" + utenteId + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email
			+ ", userId=" + userId + ", affidabilita=" + affidabilita + "]";
}













}

