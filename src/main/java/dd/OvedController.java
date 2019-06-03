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
	
	
	@GetMapping("/ristoranti")
	public String visualizzaRistoranti(Model model) {
	model.addAttribute("restaurants", repo.findAll());
	return "/ristoranti";
	}
	
	
	@GetMapping("/ristoranti")
	public String modificaRistoranti(Model model) {
	model.addAttribute("restaurants", repo.save(S entity));
	return "/ristoranti";
	}
	
	@GetMapping("/ristoranti")
	public String inserisciRistoranti(Model model) {
	model.addAttribute("restaurants", repo.save(S entity));
	return "/ristoranti";
	}
	
	@GetMapping("/ristoranti")
	public String eliminaRistoranti(Model model) {
	model.addAttribute("restaurants", repo.deleteById(ID));
	return "/ristoranti";
	}
	
}