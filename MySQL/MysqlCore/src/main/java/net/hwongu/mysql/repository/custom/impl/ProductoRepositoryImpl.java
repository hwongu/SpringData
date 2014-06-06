package net.hwongu.mysql.repository.custom.impl;

import net.hwongu.mysql.repository.custom.ProductoRepositoryCustom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProductoRepositoryImpl implements ProductoRepositoryCustom {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@SuppressWarnings("deprecation")
	public int metodoPersonalizado() {
		return jdbcTemplate.queryForInt("SELECT count(*) from PRODUCTO");
	}

}
