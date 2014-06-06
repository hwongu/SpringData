package net.hwongu.mysql.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.hwongu.mysql.core.service.ProductoService;
import net.hwongu.mysql.repository.ProductoRepository;

@Component("productoService")
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	public ProductoRepository getRepository() {
		return productoRepository;
	}

}