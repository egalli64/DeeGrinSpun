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
	
	
	@GetMapping("/elencoRistoranti")
	public String visualizzaRistoranti(Model model) {
	model.addAttribute("restaurants", repo.findAll());
	return "/elencoRistoranti";
	}
	
	
	
	
	@GetMapping("/delete")
	public String eliminaRistoranti(@RequestParam(name = "id") long id, Model model) {
		repo.deleteById(id);
		model.addAttribute("restaurants", repo.findAll());
		return "/elencoRistoranti";
	}
	
}