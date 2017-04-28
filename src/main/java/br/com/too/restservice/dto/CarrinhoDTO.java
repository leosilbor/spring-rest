package br.com.too.restservice.dto;

import java.util.List;

public class CarrinhoDTO {
	private List<ProdutoDTO> produtos;
	
	public CarrinhoDTO() {
		
	}

	public CarrinhoDTO(List<ProdutoDTO> produtos) {
		super();
		this.produtos = produtos;
	}

	public List<ProdutoDTO> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoDTO> produtos) {
		this.produtos = produtos;
	}
	
	
}
