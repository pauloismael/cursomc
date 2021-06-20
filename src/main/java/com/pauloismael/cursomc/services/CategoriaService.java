package com.pauloismael.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pauloismael.cursomc.domain.Categoria;
import com.pauloismael.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		 Optional <Categoria> obj = repo.findById(id);
		 return obj.orElse(null);
	}
	
}
