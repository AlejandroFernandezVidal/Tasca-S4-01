package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n02.S04T01N02FernandezVidalAlejandro.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloWorldController {
	
	@GetMapping("/HelloWorld")
	public String saludar(@RequestParam(defaultValue = "UNKNOWN") String nom) {
		return "Hola, " + nom + ". Estàs executant un projecte Gradle.";
	}
	@RequestMapping(value= {"/HelloWorld2","/HelloWorld2/{nom}"})
	public String saludar2(@PathVariable Optional<String> nom) {
		if(nom.isPresent()) {
			return "Hola, " + nom.get() + ". Estàs executant un projecte Gradle.";
		}else {
			return "Hola, " + nom + ". Estàs executant un projecte Gradle.";
		}
	}

}
