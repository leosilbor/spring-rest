package br.com.too.restservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.too.restservice.entity.Categoria;
import br.com.too.restservice.entity.Loja;
import br.com.too.restservice.repository.CategoriaRepository;
import br.com.too.restservice.repository.LojaRepository;

@Service
public class LojaService {
	@Autowired
	private LojaRepository lojaRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Loja findOneFetchMenu(Integer id) {
		Loja loja = lojaRepository.findOne(id);
		loja.setCategorias(categoriaRepository.findByPaiIsNullFetchSubCategorias(loja));
		carregarSubCategorias(loja.getCategorias());
		return loja;
	}

	private void carregarSubCategorias(List<Categoria> categorias) {
		if ( categorias!=null ) {
			for (Categoria cat: categorias) {
				carregarSubCategorias(cat.getSubCategorias());
			}
		}
		
	}
	
	
}
