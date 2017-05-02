package br.com.too.restservice.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.too.restservice.dto.CategoriaDTO;

@Entity
@Table
public class Categoria {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nome;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Categoria pai;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Loja loja;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="pai")
	private List<Categoria> subCategorias;
	
	public Categoria () {
		
	}
	
	
	public Categoria(CategoriaDTO categoria) {
		this.id = categoria.getId();
		this.nome = categoria.getNome();
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
