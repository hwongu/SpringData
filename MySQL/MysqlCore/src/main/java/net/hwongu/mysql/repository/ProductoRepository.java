package net.hwongu.mysql.repository;

import net.hwongu.mysql.domain.Producto;
import net.hwongu.mysql.repository.custom.ProductoRepositoryCustom;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Henry Joe Wong Urquiza
 * @mail hwongu@hwongu.net
 */
@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer>, ProductoRepositoryCustom {

}
