package net.hwongu.sqlserver2012.repository.custom.impl;

import net.hwongu.sqlserver2012.repository.custom.CategoriaRepositoryCustom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 
 * @author Henry Joe Wong Urquiza
 * @mail hwongu@hwongu.net
 */
public class CategoriaRepositoryCustomImpl implements CategoriaRepositoryCustom{

	@Autowired
	private JdbcTemplate jdbcTemplate;
}
