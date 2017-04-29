package br.com.too.restservice.dto;

import br.com.too.restservice.entity.Produto;

public class ProdutoDTO {
	private Integer id;
	private String idImagem;
	private String nome;
	private String descricao;
	private Integer quantidade;
	private Double valor;
	
	public ProdutoDTO() {
		
	}
	
	
	public ProdutoDTO(Produto produto) {
		this.id = produto.getId();
		this.nome = produto.getNome();
		this.descricao = produto.getDescricao();
		this.quantidade = produto.getQuantidade();
		this.valor = produto.getValor();
	}


	public String getIdImagem() {
		return idImagem;
	}
	public void setIdImagem(String idImagem) {
		this.idImagem = idImagem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
