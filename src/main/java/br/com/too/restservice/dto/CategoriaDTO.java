package br.com.too.restservice.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.too.restservice.entity.Categoria;

public class CategoriaDTO {
	private Integer id;
	private String nome;
	private List<CategoriaDTO> subCategorias;
	
	public CategoriaDTO() {
		
	}
	
	public CategoriaDTO(Categoria categoria) {
		this.id = categoria.getId();
		this.nome = categoria.getNome();
		if ( categoria.getSubCategorias()!=null && categoria.getSubCategorias().size()>0 ) {
			this.subCategorias = new ArrayList<>();
			for (Categoria subCategoria: categoria.getSubCategorias()) {
				this.subCategorias.add(new CategoriaDTO(subCategoria));
			}
		}
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<CategoriaDTO> getSubCategorias() {
		return subCategorias;
	}
	public void setSubCategorias(List<CategoriaDTO> subCategorias) {
		this.subCategorias = subCategorias;
	}
	
	
}
