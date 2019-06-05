package dd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "REVIEWS")
public class Green_Review{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE , generator="EmpGen")         // CREO SEQUENZA
	@SequenceGenerator(sequenceName="green_ristoranti_seq", allocationSize=1, name="EmpGen")
	@Column(name = "REVIEWS_ID")
	private long reviewsId;
	@Column(name = "SERVIZIO")
	private long servizio;
	@Column(name = "ATMOSFERA")
	private long atmosfera;
	@Column(name = "QUALITAPREZZO")
	private long qualitaprezzo;
	@Column(name = "PULIZIA")
	private long pulizia;
	@Column(name = "COMMENTO")
	private String commento;
	@ManyToOne
	@JoinColumn(name = "RISTORANTE_ID")
	private Green_Ristorante green_ristorante;
	public long getReviewsId() {
		return reviewsId;
	}
	public void setReviewsId(long reviewsId) {
		this.reviewsId = reviewsId;
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
	public long getQualitaprezzo() {
		return qualitaprezzo;
	}
	public void setQualitaprezzo(long qualitaprezzo) {
		this.qualitaprezzo = qualitaprezzo;
	}
	public long getPulizia() {
		return pulizia;
	}
	public void setPulizia(long pulizia) {
		this.pulizia = pulizia;
	}
	public String getCommento() {
		return commento;
	}
	public void setCommento(String commento) {
		this.commento = commento;
	}
	public Green_Ristorante getGreen_ristorante() {
		return green_ristorante;
	}
	public void setGreen_ristorante(Green_Ristorante green_ristorante) {
		this.green_ristorante = green_ristorante;
	}
	@Override
	public String toString() {
		return "Green_Review [reviewsId=" + reviewsId + ", servizio=" + servizio + ", atmosfera=" + atmosfera
				+ ", qualitaprezzo=" + qualitaprezzo + ", pulizia=" + pulizia + ", commento=" + commento
				+ ", green_ristorante=" + green_ristorante + "]";
	}
	public Green_Review(long reviewsId, long servizio, long atmosfera, long qualitaprezzo, long pulizia,
			String commento, Green_Ristorante green_ristorante) {
		super();
		this.reviewsId = reviewsId;
		this.servizio = servizio;
		this.atmosfera = atmosfera;
		this.qualitaprezzo = qualitaprezzo;
		this.pulizia = pulizia;
		this.commento = commento;
		this.green_ristorante = green_ristorante;
	}
	public Green_Review() {
		super();
	}
	
	
	
	
	
	
	
	
	
	
	
}

