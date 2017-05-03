package br.com.too.restservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.too.restservice.entity.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

	@Query("SELECT p FROM Produto p JOIN FETCH p.categoria WHERE p.loja.id = :idLoja")
	public List<Produto> findAllFetchCategoria(@Param("idLoja") Integer idLoja);

	@Query("SELECT p FROM Produto p JOIN FETCH p.categoria WHERE p.categoria.id = :idCategoria")
	public List<Produto> findByIdCategoriaFetchCategoria(@Param("idCategoria") Integer idCategoria);
}
