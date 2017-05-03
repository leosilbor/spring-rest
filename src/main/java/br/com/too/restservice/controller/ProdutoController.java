package br.com.too.restservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.too.restservice.dto.ProdutoDTO;
import br.com.too.restservice.entity.Loja;
import br.com.too.restservice.entity.Produto;
import br.com.too.restservice.repository.ProdutoRepository;
import br.com.too.restservice.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;
    
    @Autowired
    private ProdutoService produtoService;

    @RequestMapping(path="/{idLoja}",method=RequestMethod.POST)
    public void salvarProduto(@PathVariable("idLoja") Integer idLoja, @RequestBody(required=true) ProdutoDTO produtoDTO) {
    	Produto produto = new Produto(produtoDTO);
    	produto.setLoja(new Loja(idLoja));
    	produtoService.save(produto);
    }
    
    @RequestMapping(path="/categoria/{idCategoria}", method=RequestMethod.GET)
    public ResponseEntity<Iterable<ProdutoDTO>> pesquisarPorCategoria(@PathVariable("idCategoria") Integer idCategoria) {
    	List<ProdutoDTO> dto = new ArrayList<ProdutoDTO>();
    	List<Produto> produtos = produtoRepository.findByIdCategoriaFetchCategoria(idCategoria);
    	for (Produto produto: produtos) {
    		dto.add(new ProdutoDTO(produto));
    	}
        return ResponseEntity.ok(dto);
    }
    
    @RequestMapping(path="/{idLoja}", method=RequestMethod.GET)
    public ResponseEntity<Iterable<ProdutoDTO>> pesquisarProdutosLoja(@PathVariable("idLoja") Integer idLoja) {
    	List<ProdutoDTO> dto = new ArrayList<ProdutoDTO>();
    	List<Produto> produtos = produtoRepository.findAllFetchCategoria(idLoja);
    	for (Produto produto: produtos) {
    		dto.add(new ProdutoDTO(produto));
    	}
        return ResponseEntity.ok(dto);
    }
}
