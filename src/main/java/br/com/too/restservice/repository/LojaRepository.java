package br.com.too.restservice.repository;

import java.util.Arrays;

import org.springframework.stereotype.Repository;

import br.com.too.restservice.entity.Categoria;
import br.com.too.restservice.entity.Loja;

@Repository
public class LojaRepository  {

	public Loja find() {
		Loja loja = new Loja();
		Categoria catMasculino = new Categoria();
		catMasculino.setNome("Masculinos");
			Categoria catMascCamiseta = new Categoria();
			catMascCamiseta.setNome("Camiseta");
				Categoria catCamRegata = new Categoria();
				catCamRegata.setNome("Regata");
				Categoria catCamSocial = new Categoria();
				catCamSocial.setNome("Social");
				catMascCamiseta.setSubCategorias(Arrays.asList(new Categoria[]{catCamRegata, catCamSocial}));
			Categoria catMascBermuda = new Categoria();
			catMascBermuda.setNome("Bermuda");
		catMasculino.setSubCategorias(Arrays.asList(new Categoria[]{catMascCamiseta, catMascBermuda}));
		
		
		loja.setCategorias(Arrays.asList(new Categoria[]{catMasculino}));
		loja.setDescricao("Descrição da loja");
		loja.setEmail("email@loja.com.br");
		loja.setId(1);
		loja.setIdLogo("logo.png");
		loja.setNome("Loja");
		return loja;
	}

}
