package br.com.too.restservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.too.restservice.dto.ProdutoDTO;
import br.com.too.restservice.entity.Produto;
import br.com.too.restservice.repository.ProdutoRepository;
import br.com.too.restservice.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;
    
    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method=RequestMethod.POST)
    
    public void salvarProduto(@RequestBody(required=true) ProdutoDTO produtoDTO) {
    	Produto produto = new Produto(produtoDTO);
    	produtoRepository.save(produto);
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<Iterable<ProdutoDTO>> pesquisar() {
    	List<ProdutoDTO> dto = new ArrayList<ProdutoDTO>();
    	Iterable<Produto> produtos = produtoRepository.findAll();
    	for (Produto produto: produtos) {
    		dto.add(new ProdutoDTO(produto));
    	}
        return ResponseEntity.ok(dto);
    }
}
