package br.com.too.restservice.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.too.restservice.entity.Produto;
import br.com.too.restservice.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;

	@Transactional
	public void salvarProduto(Produto produto) {
		produtoRepository.save(produto);
	}

	
	
	
}
