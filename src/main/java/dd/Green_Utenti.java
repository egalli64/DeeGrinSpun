package dd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	
	

@Entity
@Table(name = "GREEN_RISTORANTI")
public class Green_Utenti {
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


}