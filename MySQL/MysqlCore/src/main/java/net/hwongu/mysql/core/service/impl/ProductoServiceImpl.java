package net.hwongu.mysql.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import net.hwongu.mysql.core.service.ProductoService;
import net.hwongu.mysql.repository.ProductoRepository;

/**
 * 
 * @author Henry Joe Wong Urquiza
 * @mail hwongu@hwongu.net
 */
@Component("productoService")
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	public ProductoRepository getRepository() {
		return productoRepository;
	}
	
	@Transactional
	public void delete(Integer id){
		this.productoRepository.delete(id);
	}

}
