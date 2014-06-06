package net.hwongu.mysql.test;

import java.math.BigDecimal;

import net.hwongu.mysql.core.service.CategoriaService;
import net.hwongu.mysql.core.service.ProductoService;
import net.hwongu.mysql.domain.Categoria;
import net.hwongu.mysql.domain.Producto;

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
@ContextConfiguration(locations = { "file:src/main/java//net/hwongu/mysql/configuration/SpringContext.xml" })
public class ProductoTest {
	
	@Autowired
	private ProductoService productoService;
	@Autowired
	private CategoriaService categoriaService;
	
	@Test
	public void metodo(){
		try {
			Categoria c = categoriaService.getRepository().findOne(1);
			Producto p = new Producto();
			p.setNombre("COCA COLA");
			p.setPrecio(new BigDecimal("1.5"));
			p.setIdCategoria(c);
			//productoRepository.save(p);
			System.out.println("Cantidad de productos: " + productoService.getRepository().metodoPersonalizado());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
