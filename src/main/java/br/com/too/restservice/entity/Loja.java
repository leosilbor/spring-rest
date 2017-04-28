package br.com.too.restservice.entity;

import java.util.List;

public class Loja {
	private Integer id;
	private String nome;
	private String descricao;
	private String email;
	private String idLogo;
	private List<Categoria> categorias;
	
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdLogo() {
		return idLogo;
	}
	public void setIdLogo(String idLogo) {
		this.idLogo = idLogo;
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	
	
}
