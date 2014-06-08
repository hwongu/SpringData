package net.hwongu.sqlserver2012.core.service.impl;

import net.hwongu.sqlserver2012.core.service.CategoriaService;
import net.hwongu.sqlserver2012.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Henry Joe Wong Urquiza
 * @mail hwongu@hwongu.net
 */
@Component("categoriaService")
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public CategoriaRepository getRepository() {
		return categoriaRepository;
	}

}
