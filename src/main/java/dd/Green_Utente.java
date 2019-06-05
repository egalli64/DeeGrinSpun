package dd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
	
	

@Entity
@Table(name = "GREEN_UTENTI")
public class Green_Utente {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE , generator="EmpGen")         // CREO SEQUENZA
@SequenceGenerator(sequenceName="green_utenti_seq", allocationSize=1, name="EmpGen")

@Column(name = "UTENTE_ID")
private long utenteId;
@Column(name = "NOME")
private String nome;
@Column(name = "COGNOME")
private String cognome;
@Column(name = "EMAIL")
private String email;

@Column(name = "USER_ID")
private String userId;
@Column(name = "PASSWORD_USER")
private String password_user;

@Column(name = "AFFIDABILITA")
private String affidabilita;
public long getUtenteId() {
	return utenteId;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
	

	
}
public String getPassword_user() {
	return password_user;
}
public void setPassword_user(String password) {
	this.password_user = password;
}
public String getAffidabilita() {
	return affidabilita;
}
public void setAffidabilita(String affidabilita) {
	this.affidabilita = affidabilita;
}
public void setUtenteId(long utenteId) {
	this.utenteId = utenteId;
}
@Override
public String toString() {
	return "Green_Utente [utenteId=" + utenteId + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email
			+ ", userId=" + userId + ", password_user=" + password_user + ", affidabilita=" + affidabilita + "]";
}
public Green_Utente(long utenteId, String nome, String cognome, String email, String userId, String password_user,
		String affidabilita) {
	super();
	this.utenteId = utenteId;
	this.nome = nome;
	this.cognome = cognome;
	this.email = email;
	this.userId = userId;
	this.password_user = password_user;
	this.affidabilita = affidabilita;
}

public Green_Utente() {
	
}


public Green_Utente(long utenteId, String nome, String cognome, String email, String userId,
		String affidabilita) {
	super();
	this.utenteId = utenteId;
	this.nome = nome;
	this.cognome = cognome;
	this.email = email;
	this.userId = userId;
	this.affidabilita = affidabilita;
}

public Green_Utente(String nome, String cognome, String email, String userId,
		String affidabilita) {
	super();
	this.nome = nome;
	this.cognome = cognome;
	this.email = email;
	this.userId = userId;
	this.affidabilita = affidabilita;
}




}

