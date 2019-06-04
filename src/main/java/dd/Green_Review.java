package dd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "REVIEWS")
public class Green_Review{
	@Id
	@Column(name = "REVIEWS_ID")
	private long reviews_id;
	@Column(name = "SERVIZIO")
	private long servizio;
	@Column(name = "ATMOSFERA")
	private long atmosfera;
	@Column(name = "QUALITA_PREZZO")
	private long qualitaPrezzo;
	@Column(name = "PULIZIA")
	private long pulizia;
	@Column(name = "MEDIA")
	private long media;
	@Column(name = "COMMENTO")
	private String commento;
	@ManyToOne
	@JoinColumn(name = "RISTORANTE_ID")
	private Green_Ristorante green_ristorante;
	
	
}

