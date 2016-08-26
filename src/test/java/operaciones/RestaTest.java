package operaciones;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaTest {

	@Test
	public void restaCeros() {
		
		List<Integer> cero = Arrays.asList(0);;
		
		List<Integer> resultado = Resta.resta(cero, cero);
		
		assertTrue("Sumar cero mas cero no da cero", resultado.size() == 1);
		assertTrue("Sumar cero mas cero no da cero", resultado.get(0) == 0);
	}
	
	@Test
	public void pruebaRestas() {
		
		// 1111 - 1 => 1110 
		assertEquals (Resta.resta(Arrays.asList(1,1,1,1), Arrays.asList(1)), Arrays.asList(1,1,1,0));
		// 1111 - 10 => 1101 
		assertEquals (Resta.resta(Arrays.asList(1,1,1,1), Arrays.asList(1,0)), Arrays.asList(1,1,0,1));

		// 1119 - 1 => 1118 
		assertEquals (Resta.resta(Arrays.asList(1,1,1,9), Arrays.asList(1)), Arrays.asList(1,1,1,8));
		// 9999 - 1 => 9998
		assertEquals (Resta.resta(Arrays.asList(9,9,9,9), Arrays.asList(1)), Arrays.asList(9,9,9,8));

		// 1000 - 1 => 999
		assertEquals (Resta.resta(Arrays.asList(1,0,0,0), Arrays.asList(1)), Arrays.asList(9,9,9));
		// 1010 - 1 => 1009
		assertEquals (Resta.resta(Arrays.asList(1,0,1,0), Arrays.asList(1)), Arrays.asList(1,0,0,9));

		// 123 - 123 => 0
		assertEquals (Resta.resta(Arrays.asList(1,2,3), Arrays.asList(1,2,3)), Arrays.asList(0));
		// 923 + 323 => 600
		assertEquals (Resta.resta(Arrays.asList(9,2,3), Arrays.asList(3,2,3)), Arrays.asList(6,0,0));

	}
	
}
