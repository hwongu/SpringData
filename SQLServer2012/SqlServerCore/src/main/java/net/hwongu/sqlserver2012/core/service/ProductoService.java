package net.hwongu.sqlserver2012.core.service;

import net.hwongu.sqlserver2012.core.service.base.BaseService;
import net.hwongu.sqlserver2012.repository.ProductoRepository;

/**
 * 
 * @author Henry Joe Wong Urquiza
 * @mail hwongu@hwongu.net
 */
public interface ProductoService extends BaseService<ProductoRepository>{

	void delete(Integer id);
}
