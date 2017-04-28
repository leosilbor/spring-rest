package br.com.too.restservice.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.too.restservice.entity.Categoria;

public class MenuDTO {
	private List<CategoriaDTO> categorias;
	
	public MenuDTO() {
		
	}

	public MenuDTO(List<Categoria> categorias) {
		this.categorias = new ArrayList<>();
		for (Categoria categoria: categorias) {
			this.categorias.add(new CategoriaDTO(categoria));
		}
	}

	public List<CategoriaDTO> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<CategoriaDTO> categorias) {
		this.categorias = categorias;
	}
	
	
}
