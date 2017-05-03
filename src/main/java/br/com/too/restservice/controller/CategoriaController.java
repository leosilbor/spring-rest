package br.com.too.restservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.too.restservice.dto.CategoriaDTO;
import br.com.too.restservice.entity.Categoria;
import br.com.too.restservice.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @RequestMapping(path="/{idLoja}", method=RequestMethod.GET)
    public ResponseEntity<Iterable<CategoriaDTO>> pesquisar(@PathVariable("idLoja") Integer idLoja) {
    	List<CategoriaDTO> dto = new ArrayList<CategoriaDTO>();
    	List<Categoria> categorias = categoriaRepository.findByLojaId(idLoja);
    	for (Categoria categoria: categorias) {
    		if ( categoria.getSubCategorias()==null || categoria.getSubCategorias().size()==0 )
    			dto.add(new CategoriaDTO(categoria));
    	}
        return ResponseEntity.ok(dto);
    }
    
//    @RequestMapping(path="/menu", method=RequestMethod.GET)
//    public ResponseEntity<Iterable<CategoriaDTO>> montarMenu() {
//    	List<CategoriaDTO> dto = new ArrayList<CategoriaDTO>();
//    	Iterable<Categoria> categorias = categoriaRepository.findByPaiIsNullFetchSubCategorias();
//    	for (Categoria categoria: categorias) {
//    		dto.add(new CategoriaDTO(categoria));
//    	}
//        return ResponseEntity.ok(dto);
//    }
}
