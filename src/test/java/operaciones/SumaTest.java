package operaciones;

import java.util.ArrayList;
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
	
}
