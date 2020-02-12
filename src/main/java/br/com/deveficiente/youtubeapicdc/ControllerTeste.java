package br.com.deveficiente.youtubeapicdc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTeste {
	
	@GetMapping(value = "/api/teste")
	public String teste() {
		return "Está configurado";
	}

}
