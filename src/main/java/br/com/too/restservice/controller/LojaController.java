package br.com.too.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.too.restservice.dto.LojaDTO;
import br.com.too.restservice.service.LojaService;

@RestController
@RequestMapping("/lojas")
public class LojaController {

    @Autowired
    private LojaService lojaService;

    @RequestMapping(path="/{login}", method=RequestMethod.GET)
    public LojaDTO dadosLoja(@PathVariable("login") String login) {
        return new LojaDTO(lojaService.findOneFetchMenu(login));
    }
}
