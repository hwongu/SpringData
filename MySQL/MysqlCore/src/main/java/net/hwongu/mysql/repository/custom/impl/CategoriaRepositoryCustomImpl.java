package net.hwongu.mysql.repository.custom.impl;

import net.hwongu.mysql.repository.custom.CategoriaRepositoryCustom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CategoriaRepositoryCustomImpl implements CategoriaRepositoryCustom{

	@Autowired
	private JdbcTemplate jdbcTemplate;
}
