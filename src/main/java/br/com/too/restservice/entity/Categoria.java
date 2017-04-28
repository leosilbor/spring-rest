package br.com.too.restservice.entity;

import java.util.List;

public class Categoria {
	private Integer id;
	private String nome;
	private Categoria pai;
	private Loja loja;
	private List<Categoria> subCategorias;
	
	
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
	public Categoria getPai() {
		return pai;
	}
	public void setPai(Categoria pai) {
		this.pai = pai;
	}
	public Loja getLoja() {
		return loja;
	}
	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	public List<Categoria> getSubCategorias() {
		return subCategorias;
	}
	public void setSubCategorias(List<Categoria> subCategorias) {
		this.subCategorias = subCategorias;
	}
	
	
}
