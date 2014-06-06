package net.hwongu.mysql.repository;

import net.hwongu.mysql.domain.Categoria;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer>{

}
