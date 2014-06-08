package net.hwongu.sqlserver2012.repository;

import net.hwongu.sqlserver2012.domain.Categoria;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Henry Joe Wong Urquiza
 * @mail hwongu@hwongu.net
 */
@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer>{

}
