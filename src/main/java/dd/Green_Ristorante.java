package dd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	
	

@Entity
@Table(name = "GREEN_RISTORANTI")
public class Green_Ristorante {
@Id
@Column(name = "RISTORANTE_ID")
private long ristoranteId;
@Column(name = "NOME")
private String nome;
@Column(name = "POSIZIONE")
private String posizione;
@Column(name = "POSTI_DISPONIBILI")
private long postiDisponibili;
@Column(name = "TIPO_CUCINA")
private String tipoCucina;
@Column(name = "EMAIL")
private String email;








// costruttore
public Green_Ristorante() {
	super();
}

public Green_Ristorante(long ristoranteId, String nome, String posizione, long postiDisponibili, String tipoCucina,
		String email) {
	super();
	setristoranteId(ristoranteId);
	setNome(nome);
	setPosizione(posizione);
	setPostiDisponibili(postiDisponibili);
	setTipoCucina(tipoCucina);
	setEmail(email);
}


public Green_Ristorante(Green_Ristorante green) {
	super();
	setristoranteId(green.ristoranteId);
	setNome(green.nome);
	setPosizione(green.posizione);
	setPostiDisponibili(green.postiDisponibili);
	setTipoCucina(green.tipoCucina);
	setEmail(green.email);
}

//get set to string
public long getRistoranteId() {
	return ristoranteId;
}

public void setristoranteId(long ristoranteId) {
	this.ristoranteId = ristoranteId;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getPosizione() {
	return posizione;
}
public void setPosizione(String posizione) {
	this.posizione = posizione;
}
public long getPostiDisponibili() {
	return postiDisponibili;
}
public void setPostiDisponibili(long postiDisponibili) {
	this.postiDisponibili = postiDisponibili;
}
public String getTipoCucina() {
	return tipoCucina;
}
public void setTipoCucina(String tipoCucina) {
	this.tipoCucina = tipoCucina;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Green_Ristoranti [ristoranteId=" + ristoranteId + ", nome=" + nome + ", posizione=" + posizione + ", postiDisponibili="
			+ postiDisponibili + ", tipoCucina=" + tipoCucina + ", email=" + email + "]";
}












	
	
}
