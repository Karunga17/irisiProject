package controller;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import model.HelloWorld;
import model.Produit;
import service.ProduitService;

@Controller
public class ProduitController {
	@GetMapping("/produit/list")
	public String list(Model model) {
        model.addAttribute("produits",new ProduitService().findAll());
		return "index";
	}
	
	@GetMapping("/")
	public String index(Model model) {
        model.addAttribute("produits",new ProduitService().findAll());
		return "index";
	}
}

