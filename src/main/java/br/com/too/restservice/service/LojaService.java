package br.com.too.restservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.too.restservice.entity.Loja;
import br.com.too.restservice.repository.LojaRepository;

@Service
public class LojaService {
	@Autowired
	private LojaRepository lojaRepository;

	public Loja findOne() {
		return lojaRepository.find();
	}
	
	
}
