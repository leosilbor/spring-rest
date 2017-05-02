package br.com.too.restservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.too.restservice.entity.Loja;

@Repository
public interface LojaRepository extends CrudRepository<Loja, Integer>  {

//	@Query("SELECT l FROM Loja l join fetch l.categorias WHERE l.id = :id")
//	public Loja findOneFetchCategorias(@Param("id") Integer id);
}
