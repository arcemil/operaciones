package operaciones;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumaTest {

	@Test
	public void sumaCeros() {
		
		List<Integer> cero = Arrays.asList(0);;
		
		List<Integer> resultado = Suma.suma(cero, cero);
		
		assertTrue("Sumar cero mas cero no da cero", resultado.size() == 1);
		assertTrue("Sumar cero mas cero no da cero", resultado.get(0) == 0);
	}
	
	@Test
	public void pruebaSumas() {
		
		// 1111 + 1 => 1112 
		assertEquals (Suma.suma(Arrays.asList(1,1,1,1), Arrays.asList(1)), Arrays.asList(1,1,1,2));
		// 1111 + 10 => 1121 
		assertEquals (Suma.suma(Arrays.asList(1,1,1,1), Arrays.asList(1,0)), Arrays.asList(1,1,2,1));

		// 1119 + 1 => 1120 
		assertEquals (Suma.suma(Arrays.asList(1,1,1,9), Arrays.asList(1)), Arrays.asList(1,1,2,0));
		// 1999 + 1 => 2000
		assertEquals (Suma.suma(Arrays.asList(1,9,9,9), Arrays.asList(1)), Arrays.asList(2,0,0,0));
		// 9999 + 1 => 10000
		assertEquals (Suma.suma(Arrays.asList(9,9,9,9), Arrays.asList(1)), Arrays.asList(1,0,0,0,0));

		// 123 + 123 => 246
		assertEquals (Suma.suma(Arrays.asList(1,2,3), Arrays.asList(1,2,3)), Arrays.asList(2,4,6));
		// 923 + 323 => 1246
		assertEquals (Suma.suma(Arrays.asList(9,2,3), Arrays.asList(3,2,3)), Arrays.asList(1,2,4,6));	
	}
	
}
