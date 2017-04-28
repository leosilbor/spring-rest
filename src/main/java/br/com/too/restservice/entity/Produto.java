package br.com.too.restservice.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.too.restservice.dto.ProdutoDTO;

@Entity
@Table
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String nome;
	@Column
	private String descricao;
	@Transient
	private List<Imagem> imagens;
	@Column
	private Double valor;
	@Column
	private String hashImagemPrincipal;
	
	public Produto() {
		
	}
	
	public Produto(ProdutoDTO produtoDTO) {
		this.id = produtoDTO.getId();
		this.nome = produtoDTO.getNome();
		this.descricao = produtoDTO.getDescricao();
		this.valor = produtoDTO.getValor();
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Imagem> getImagens() {
		return imagens;
	}
	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getHashImagemPrincipal() {
		return hashImagemPrincipal;
	}
	public void setHashImagemPrincipal(String hashImagemPrincipal) {
		this.hashImagemPrincipal = hashImagemPrincipal;
	}
	
	
}
