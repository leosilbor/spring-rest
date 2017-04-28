package br.com.too.restservice.repository;

import java.util.Arrays;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.too.restservice.entity.Categoria;
import br.com.too.restservice.entity.Loja;
import br.com.too.restservice.entity.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

	

}
