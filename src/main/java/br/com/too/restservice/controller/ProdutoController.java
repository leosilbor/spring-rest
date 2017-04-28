package br.com.too.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.too.restservice.dto.ProdutoDTO;
import br.com.too.restservice.entity.Produto;
import br.com.too.restservice.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @RequestMapping(method=RequestMethod.POST)
    public void salvarProduto(ProdutoDTO produtoDTO) {
    	Produto produto = new Produto(produtoDTO);
        produtoService.salvarProduto(produto);
    }
}
