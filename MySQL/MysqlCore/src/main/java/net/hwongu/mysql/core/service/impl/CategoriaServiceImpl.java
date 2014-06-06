package net.hwongu.mysql.core.service.impl;

import net.hwongu.mysql.core.service.CategoriaService;
import net.hwongu.mysql.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("categoriaService")
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public CategoriaRepository getRepository() {
		return categoriaRepository;
	}

}
