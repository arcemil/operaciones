package operaciones;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class ComparacionesTest {

	@Test
	public void pruebaIguales()  {
		
		// 0 == 0 => true
		assertTrue (Utils.iguales( Arrays.asList(0), Arrays.asList(0)));
		// 1000 == 1000 => true
		assertTrue (Utils.iguales( Arrays.asList(1, 0, 0, 0), Arrays.asList(1, 0, 0, 0)));

		// 1 == 01 => true
		assertTrue (Utils.iguales( Arrays.asList(1), Arrays.asList(0, 1)));
		// 10 == 010 => true
		assertTrue (Utils.iguales( Arrays.asList(1, 0), Arrays.asList(0, 1, 0)));

		// 0 == 1 => false
		assertFalse (Utils.iguales( Arrays.asList(0), Arrays.asList(1)));
		// 1000 == 1001 => false
		assertFalse (Utils.iguales( Arrays.asList(1, 0, 0, 0), Arrays.asList(1, 0, 0, 1)));
		// 1000 == 1010 => false
		assertFalse (Utils.iguales( Arrays.asList(1, 0, 0, 0), Arrays.asList(1, 0, 1, 0)));

		// 10 == 1001 => false
		assertFalse (Utils.iguales( Arrays.asList(1, 0), Arrays.asList(1, 0, 0, 1)));
		// 1010 == 10 => false
		assertFalse (Utils.iguales( Arrays.asList(1, 0, 1, 0), Arrays.asList(1, 0)));	
	}
	
	@Test
	public void pruebaMayor()  {
		
		// 0 > 0 => false
		assertFalse (Utils.mayor( Arrays.asList(0), Arrays.asList(0)));
		// 1000 > 1000 => false
		assertFalse (Utils.mayor( Arrays.asList(1, 0, 0, 0), Arrays.asList(1, 0, 0, 0)));

		// 1 > 01 => false
		assertFalse (Utils.mayor( Arrays.asList(1), Arrays.asList(0, 1)));
		// 10 > 010 => false
		assertFalse (Utils.mayor( Arrays.asList(1, 0), Arrays.asList(0, 1, 0)));

		// 0 > 1 => false
		assertFalse (Utils.mayor( Arrays.asList(0), Arrays.asList(1)));
		// 1 > 0 => true
		assertTrue (Utils.mayor( Arrays.asList(1), Arrays.asList(0)));

		// 1001 > 1000 => true
		assertTrue (Utils.mayor( Arrays.asList(1, 0, 0, 1), Arrays.asList(1, 0, 0, 0)));
		// 1000 > 1010 => false
		assertFalse (Utils.mayor( Arrays.asList(1, 0, 0, 0), Arrays.asList(1, 0, 1, 0)));

		// 10 > 1001 => false
		assertFalse (Utils.mayor( Arrays.asList(1, 0), Arrays.asList(1, 0, 0, 1)));
		// 1010 > 10 => true
		assertTrue (Utils.mayor( Arrays.asList(1, 0, 1, 0), Arrays.asList(1, 0)));	
	}	

	@Test
	public void pruebaMenor()  {
		
		// 0 < 0 => false
		assertFalse (Utils.menor( Arrays.asList(0), Arrays.asList(0)));
		// 1000 < 1000 => false
		assertFalse (Utils.menor( Arrays.asList(1, 0, 0, 0), Arrays.asList(1, 0, 0, 0)));

		// 1 < 01 => false
		assertFalse (Utils.menor( Arrays.asList(1), Arrays.asList(0, 1)));
		// 10 < 010 => false
		assertFalse (Utils.menor( Arrays.asList(1, 0), Arrays.asList(0, 1, 0)));

		// 0 < 1 => true
		assertTrue (Utils.menor( Arrays.asList(0), Arrays.asList(1)));
		// 1 < 0 => false
		assertFalse (Utils.menor( Arrays.asList(1), Arrays.asList(0)));

		// 1001 < 1000 => false
		assertFalse (Utils.menor( Arrays.asList(1, 0, 0, 1), Arrays.asList(1, 0, 0, 0)));
		// 1000 < 1010 => true
		assertTrue (Utils.menor( Arrays.asList(1, 0, 0, 0), Arrays.asList(1, 0, 1, 0)));

		// 10 < 1001 => true
		assertTrue (Utils.menor( Arrays.asList(1, 0), Arrays.asList(1, 0, 0, 1)));
		// 1010 < 10 => false
		assertFalse (Utils.menor( Arrays.asList(1, 0, 1, 0), Arrays.asList(1, 0)));	
	}		
	
}
