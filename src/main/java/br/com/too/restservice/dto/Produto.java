package br.com.too.restservice.dto;

public class Produto {
	private String idImagem;
	private String nome;
	private Integer quantidade;
	
	public Produto() {
		
	}
	
	public Produto(String idImagem, String nome, Integer quantidade) {
		super();
		this.idImagem = idImagem;
		this.nome = nome;
		this.quantidade = quantidade;
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
	
	
}
