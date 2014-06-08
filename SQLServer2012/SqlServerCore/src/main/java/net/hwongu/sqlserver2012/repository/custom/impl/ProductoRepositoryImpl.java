package net.hwongu.sqlserver2012.repository.custom.impl;

import net.hwongu.sqlserver2012.repository.custom.ProductoRepositoryCustom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 
 * @author Henry Joe Wong Urquiza
 * @mail hwongu@hwongu.net
 */
public class ProductoRepositoryImpl implements ProductoRepositoryCustom {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@SuppressWarnings("deprecation")
	public int metodoPersonalizado() {
		return jdbcTemplate.queryForInt("SELECT count(*) from PRODUCTO");
	}

}
