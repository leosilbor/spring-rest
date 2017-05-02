package br.com.too.restservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.too.restservice.entity.Categoria;
import br.com.too.restservice.entity.Loja;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {

	//@Query("SELECT c FROM Categoria c join fetch c.subCategorias where c.pai IS NULL")
	@Query("SELECT c FROM Categoria c WHERE c.pai IS NULL AND c.loja = :loja")
	public List<Categoria> findByPaiIsNullFetchSubCategorias (@Param("loja") Loja loja);
	

}
