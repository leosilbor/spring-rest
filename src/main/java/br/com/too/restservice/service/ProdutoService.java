package br.com.too.restservice.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.too.restservice.entity.Categoria;
import br.com.too.restservice.entity.Produto;
import br.com.too.restservice.repository.CategoriaRepository;
import br.com.too.restservice.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;


	@Transactional
	public void save(Produto produto) {
		Categoria categoria = produto.getCategoria();
		if ( categoria.getId()==null ) {
			categoria.setLoja(produto.getLoja());
			produto.setCategoria( categoriaRepository.save(categoria) );
		}
		produtoRepository.save(produto);
	}

	
	
	
}
