package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.HelloWorld;

@Controller
public class HomeController {
	@GetMapping("/helloworld")
	public String index(Model model) {
		HelloWorld helloWorld = new HelloWorld("Je suis IRISI");
		model.addAttribute("helloworld", helloWorld);
		return "index";
	}
}
