package br.com.deveficiente.youtubeapicdc.detalheLivro;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudCategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@PostMapping(value = "/api/categoria")
	@Transactional
	public void nova(@RequestBody @Valid NovaCategoriaForm form) {
		Categoria novaCategoria = new Categoria(form.getNome());
		categoriaRepository.save(novaCategoria);
	}

}
