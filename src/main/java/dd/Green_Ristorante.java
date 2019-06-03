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
