package operaciones;

import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionTest {

	@Test
	public void pruebaObtenerPrimeraParte() {
		assertEquals(Arrays.asList(1,1), Division.obtenerPrimeraParte(Arrays.asList(1,1,1), Arrays.asList(1,1)));
		assertEquals(Arrays.asList(1,5), Division.obtenerPrimeraParte(Arrays.asList(1,5,1), Arrays.asList(1,1)));
		assertEquals(Arrays.asList(1,0,1), Division.obtenerPrimeraParte(Arrays.asList(1,0,1), Arrays.asList(1,1)));
	}
	
	@Test
	public void pruebaDividirParte() {
		assertEquals(1, Division.dividirParte(Arrays.asList(1), Arrays.asList(1)));
		assertEquals(2, Division.dividirParte(Arrays.asList(2), Arrays.asList(1)));

		assertEquals(1, Division.dividirParte(Arrays.asList(5), Arrays.asList(5)));
		assertEquals(2, Division.dividirParte(Arrays.asList(1,0), Arrays.asList(5)));
		assertEquals(3, Division.dividirParte(Arrays.asList(1,5), Arrays.asList(5)));
		assertEquals(4, Division.dividirParte(Arrays.asList(2,0), Arrays.asList(5)));
		assertEquals(5, Division.dividirParte(Arrays.asList(2,5), Arrays.asList(5)));	
	}	
	
	@Test
	public void pruebaDividir() {
		
		assertEquals(Arrays.asList(1), Division.dividir(Arrays.asList(1), Arrays.asList(1)));
		assertEquals(Arrays.asList(2), Division.dividir(Arrays.asList(2), Arrays.asList(1)));

		assertEquals(Arrays.asList(1), Division.dividir(Arrays.asList(5), Arrays.asList(5)));
		assertEquals(Arrays.asList(2), Division.dividir(Arrays.asList(1,0), Arrays.asList(5)));
		assertEquals(Arrays.asList(3), Division.dividir(Arrays.asList(1,5), Arrays.asList(5)));
		assertEquals(Arrays.asList(4), Division.dividir(Arrays.asList(2,0), Arrays.asList(5)));
		assertEquals(Arrays.asList(5), Division.dividir(Arrays.asList(2,5), Arrays.asList(5)));		
		
		assertEquals(Arrays.asList(1,1), Division.dividir(Arrays.asList(5,5), Arrays.asList(5)));
		assertEquals(Arrays.asList(2,0), Division.dividir(Arrays.asList(1,0,0), Arrays.asList(5)));
		assertEquals(Arrays.asList(3,0), Division.dividir(Arrays.asList(1,5,0), Arrays.asList(5)));
		assertEquals(Arrays.asList(4,0), Division.dividir(Arrays.asList(2,0,0), Arrays.asList(5)));
		assertEquals(Arrays.asList(5,0), Division.dividir(Arrays.asList(2,5,0), Arrays.asList(5)));		

		assertEquals(Arrays.asList(1,3,1), Division.dividir(Arrays.asList(1,3,1), Arrays.asList(1)));
		assertEquals(Arrays.asList(1,0), Division.dividir(Arrays.asList(1,3,1), Arrays.asList(1,3)));	
		assertEquals(Arrays.asList(8), Division.dividir(Arrays.asList(1,3,1), Arrays.asList(1,5)));	
	}
	
}
