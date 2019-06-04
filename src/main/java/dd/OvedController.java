package dd;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;








@Controller
public class OvedController {
	
	
	@Autowired Green_RistorantiRepo repo;
	@Autowired Green_RistorantiRepo repoModifica;
	

	
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
	public String updateRistoranti(@RequestParam(name = "id") long ristoranteId, 
			@RequestParam(name = "nome") String nome, @RequestParam(name = "posizione") String posizione,
			@RequestParam(name = "postiDisponibili") long postiDisponibili, 
			@RequestParam(name = "tipoCucina") String tipoCucina,
			@RequestParam(name="email") String email,
			
			Model model) {
		Green_Ristorante risto= new Green_Ristorante(ristoranteId, nome, posizione, postiDisponibili,  tipoCucina,
				email);
		repoModifica.save(risto);
		model.addAttribute("restaurant", repoModifica.findAll());
		return "/modifica";
	}
	
	
	@GetMapping("/modifica")
	public String modificaRistoranti(@RequestParam(name = "id") long ristoranteId, 
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
	
	
	
	
	@GetMapping("/delete")
	public String eliminaRistoranti(@RequestParam(name = "id") long id, Model model) {
		repo.deleteById(id);
		model.addAttribute("restaurants", repo.findAll()); /* dopo aver cancellato l'elemento dall'oggetto,
		devo ripassare i valori nell'oggetto repo con findAll */
		return "/elenco";
	}
	
	

	
	
	

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