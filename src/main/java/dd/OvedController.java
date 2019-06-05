package dd;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;








@Controller
public class OvedController {
	
	
	@Autowired Green_RistorantiRepo repo;
	@Autowired Green_UtentiRepo repoModifica;
	
	//-------------- ACCESSO UTENTI---------------
	@GetMapping("/elencoView")
	public String elencoView(Model model) {
		model.addAttribute("restaurants", repo.findAll());
			return "/elencoView";
	}
	
	
	@GetMapping("/vedirecensioni")
	public String vediRecensioni(Model model) {
		model.addAttribute("restaurants", repo.findAll());
			return "/vedirecensioni";
	}
	
	
	@GetMapping("/feedback")
	public String feedback(/*@RequestParam(name = "id") long reviewsId, 
			@RequestParam(name = "servizio") long servizio, @RequestParam(name = "atmosfera") long atmosfera,
			@RequestParam(name = "qualitaprezzo") long qualitaprezzo, 
			@RequestParam(name = "password") long pulizia,
			@RequestParam(name="commento") String commento,
			Model model*/) {
	
			return "/feedback";
	}
	
	
	@GetMapping("/confirmFeedback")
	 public String confirmFeedback(Model model) {
		model.addAttribute("restaurants", repo.findAll()); 
			return "/elencoView";
	}
	
	// ---------- ACCESSO ADMIN ---------------
	@GetMapping("/AccessoAdmin")
	public String admin() {
		
	return "/AccessoAdmin";
	}
	@GetMapping("/Home")
	public String admin() {
		
		return "/index";
	}
	
	
	@GetMapping("/accesso")
	public String admin(@RequestParam String user, @RequestParam String password) {
		if(user.equals("123456") && password.equals("123456")) {
			return "/Admin";
		}
		
		else{
			return "/AccessoAdmin";
		}
	}
	
	
	
	
// --------------------------- RISTORANTI CORRETTO ---------------------------------
	
	@GetMapping("/ristoratore")
	public String elenco(Model model) {
		model.addAttribute("restaurants", repo.findAll()); 
		return "/elenco";
	}
	
	
	@GetMapping("/insert")
	public String insert() { 
		return "/inserisci";
	}
	
	
	@GetMapping("/confirm")
	public String inserisciRistoranti(@RequestParam(name = "id") long ristoranteId, 
			@RequestParam(name = "nome") String nome, @RequestParam(name = "posizione") String posizione,
			@RequestParam(name = "postiDisponibili") long postiDisponibili, 
			@RequestParam(name = "tipoCucina") String tipoCucina,
			@RequestParam(name="email") String email,
			
			Model model) {
		Green_Ristorante risto= new Green_Ristorante(ristoranteId, nome, posizione, postiDisponibili,  tipoCucina,
			email);
		repo.save(risto);
		model.addAttribute("restaurants", repo.findAll()); /* dopo aver inserito l'elemento dall'oggetto,
		devo ripassare i valori nell'oggetto repo con findAll */
		return "/elenco";
	}
	
	
	@GetMapping("/update")
	public String updateRistoranti( @RequestParam Long id,Model model) {
		
		
		Optional<Green_Ristorante> opt= repo.findById(id); /* ritorna un optional di ristorante 
		(l'OPTIONAL serve per poter lavorare anche con i null. Optional è una collezione,
		e lo dobbiamo importare. */
		
		if(opt.isPresent()) { // se opt non è null
			
			model.addAttribute("restaurant", opt.get()); // opt.get passa il valore nella chiave "restaurant"
			
		}
		return "/modifica";
	}
	
	
	@GetMapping("/modifica")
	public String modificaRistoranti(@RequestParam(name = "id") long ristoranteId, 
			@RequestParam(name = "nome") String nome, @RequestParam(name = "posizione") String posizione,
			@RequestParam(name = "postiDisponibili") long postiDisponibili, 
			@RequestParam(name = "tipoCucina") String tipoCucina,
			@RequestParam(name="email") String email, Model model) {
		
		Green_Ristorante risto= new Green_Ristorante(ristoranteId, nome, posizione, postiDisponibili,  tipoCucina,
				email);
			repo.save(risto);
			model.addAttribute("restaurants", repo.findAll()); /* dopo aver inserito l'elemento dall'oggetto,
			devo ripassare i valori nell'oggetto repo con findAll */
			
			return "/elenco";
		
		
	
	}
	
	
	
	
	@GetMapping("/delete")
	public String eliminaRistoranti(@RequestParam(name = "id") long id, Model model) {
		repo.deleteById(id);
		model.addAttribute("restaurants", repo.findAll()); /* dopo aver cancellato l'elemento dall'oggetto,
		devo ripassare i valori nell'oggetto repo con findAll */
		return "/elenco";
	}
	
	

	
	
	//-------------------------- UTENTI DA CORREGGERE ---------------------------------

@Autowired Green_UtentiRepo repo2;
	
	@GetMapping("/utente")
	public String elencoUtenti(Model model) {
		model.addAttribute("users", repo2.findAll()); 
		return "/elencoUtente";
	}
	
	
	@GetMapping("/insertUtente")
	public String insertUtente() { 
		return "/inserisciUtente";
	}
	
	
	@GetMapping("/confirmUtente")
	public String inserisciUtenti(@RequestParam(name = "id") long utenteId, 
			@RequestParam(name = "nome") String nome, @RequestParam(name = "cognome") String cognome,
			@RequestParam(name = "email") String email, 
			@RequestParam(name = "password") String password,
			@RequestParam(name="affidabilita") String affidabilita,
			
			Model model) {
		Green_Utente uten= new Green_Utente(utenteId, nome, cognome, email, password,
			affidabilita);
		repo2.save(uten);
		model.addAttribute("users", repo2.findAll()); /* dopo aver inserito l'elemento dall'oggetto,
		devo ripassare i valori nell'oggetto repo con findAll */
		return "/elencoUtente";
	}
	





	
	@GetMapping("/updateUtente")
	public String updateUtente() {
		
		return "/modificaUtente";
	}
	
	
	@GetMapping("/modificaUtente")
	public String modificaUtenti(@RequestParam(name = "id") long utenteId, 
			@RequestParam(name = "nome") String nome, @RequestParam(name = "cognome") String cognome,
			@RequestParam(name = "email") String email, 
			@RequestParam(name = "password") String password,
			@RequestParam(name="affidabilita") String affidabilita,
			
			Model model)  {
		Green_Utente uten= new Green_Utente(utenteId, nome, cognome, email, password,
			affidabilita);
		repo2.save(uten);
		model.addAttribute("users", repo2.findAll()); /* dopo aver inserito l'elemento dall'oggetto,
		devo ripassare i valori nell'oggetto repo con findAll */
		return "/elencoUtente";
	}
	
	
	
	
	
	
	
	
}