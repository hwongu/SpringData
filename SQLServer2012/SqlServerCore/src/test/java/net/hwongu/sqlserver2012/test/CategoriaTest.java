package net.hwongu.sqlserver2012.test;

import net.hwongu.sqlserver2012.core.service.CategoriaService;
import net.hwongu.sqlserver2012.domain.Categoria;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author Henry Joe Wong Urquiza
 * @mail hwongu@hwongu.net
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/java//net/hwongu/sqlserver2012/configuration/SpringContext.xml" })
public class CategoriaTest {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@Test
	public void test(){
		try {
			Categoria categoria = new Categoria();
			categoria.setNombre("GALLETA");
			//categoriaService.getRepository().save(categoria);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
