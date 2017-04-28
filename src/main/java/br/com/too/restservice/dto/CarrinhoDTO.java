package br.com.too.restservice.dto;

import java.util.List;

public class CarrinhoDTO {
	private List<Produto> produtos;
	
	public CarrinhoDTO() {
		
	}

	public CarrinhoDTO(List<Produto> produtos) {
		super();
		this.produtos = produtos;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
