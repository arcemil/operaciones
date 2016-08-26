package operaciones;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class QuitarCerosTest {

	@Test
	public void probarQuitarCeros() {
		
		// 00000 => 0 
		assertEquals (Utils.quitarCeros(Arrays.asList(0,0,0,0,0)), Arrays.asList(0));
		// 00001 => 1
		assertEquals (Utils.quitarCeros(Arrays.asList(0,0,0,0,1)), Arrays.asList(1));
		// 00100 => 100
		assertEquals (Utils.quitarCeros(Arrays.asList(0,0,1,0,0)), Arrays.asList(1, 0, 0));
		
	}
	
}
