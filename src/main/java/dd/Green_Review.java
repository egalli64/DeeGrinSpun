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
	@Column(name = "RISTORANTE_ID")
	private long ristoranteId;
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
	
	public long getRestaurantId() {
		return ristoranteId;
	}
	public void setRestaurantId(long restaurantId) {
		this.ristoranteId = restaurantId;
	}
	public long getServizio() {
		return servizio;
	}
	public void setServizio(long servizio) {
		this.servizio = servizio;
	}
	public long getAtmosfera() {
		return atmosfera;
	}
	public void setAtmosfera(long atmosfera) {
		this.atmosfera = atmosfera;
	}
	public long getQualitaPrezzo() {
		return qualitaPrezzo;
	}
	public void setQualitaPrezzo(long qualitaPrezzo) {
		this.qualitaPrezzo = qualitaPrezzo;
	}
	public long getPulizia() {
		return pulizia;
	}
	public void setPulizia(long pulizia) {
		this.pulizia = pulizia;
	}
	public long getMedia() {
		return media;
	}
	public void setMedia(long media) {
		this.media = media;
	}
	
	public Green_Review(long restaurantId, long servizio, long atmosfera, long qualitaPrezzo, long pulizia,
			long media) {
		super();
		this.ristoranteId = restaurantId;
		this.servizio = servizio;
		this.atmosfera = atmosfera;
		this.qualitaPrezzo = qualitaPrezzo;
		this.pulizia = pulizia;
		this.media = media;
	}
	
	public Green_Review() {
		super();
	}
	
	
}

