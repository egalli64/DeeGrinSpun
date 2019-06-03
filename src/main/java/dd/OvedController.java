package dd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;








@Controller
public class OvedController {
	private static final Logger logger = LoggerFactory.getLogger(OvedController.class);
	// …
	
	@Autowired Green_RistorantiRepo repo;
	
	

	
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
	
	
	
	
	
	
	@GetMapping("/delete")
	public String eliminaRistoranti(@RequestParam(name = "id") long id, Model model) {
		repo.deleteById(id);
		model.addAttribute("restaurants", repo.findAll()); /* dopo aver cancellato l'elemento dall'oggetto,
		devo ripassare i valori nell'oggetto repo con findAll */
		return "/elenco";
	}
	
}