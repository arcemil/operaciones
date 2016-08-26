package operaciones;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumaUnoTest {

	@Test
	public void NoventaYNuevaMasUno() {
		
		List<Integer> noventaYNueve = new ArrayList<Integer>();
		noventaYNueve.add(9);
		noventaYNueve.add(9);
		
		List<Integer> result = Suma.sumarUno(noventaYNueve);
		
		assertEquals("Sumar 99 mas uno no da un resultado de tres digitos", result.size(), 3);
		assertTrue("Sumar 99 mas uno no da 100", result.get(0) == 1 && result.get(1) == 0 && result.get(2) == 0);
	}

	@Test
	public void TrescientosQuinceMasUno() {
		
		List<Integer> TrescientosQuince = new ArrayList<Integer>();
		TrescientosQuince.add(3);
		TrescientosQuince.add(1);
		TrescientosQuince.add(5);
		
		List<Integer> result = Suma.sumarUno(TrescientosQuince);
		System.out.println("valor + uno : " + Utils.listToString(result));
		
		assertEquals("Sumar 315 mas uno no da un resultado de tres digitos", result.size(), 3);
		assertTrue("Sumar 315 mas uno no da 316", result.get(0) == 3 && result.get(1) == 1 && result.get(2) == 6);
	}
	
	@Test
	public void valorAleatorioMasUno() {

		// número aleatorio de digitos
		Random r = new Random();
		int n = r.nextInt(1001);
		
		// valor aleatgorio con esa cantidad de digitos
		List<Integer> A = Utils.randArray(n);			
		System.out.println("valor : " + Utils.listToString(A));
		
		// valor más uno
		List<Integer> result = Suma.sumarUno(A);
		System.out.println("valor + uno : " + Utils.listToString(result));
		
		// obtiene el resultado con BigInteger (oráculo)
		BigInteger numero = new BigInteger(Utils.listToString(A));
		numero.add( new BigInteger("1") );
		System.out.println("valor + uno : " + numero.toString());
		
		assertEquals("no coincide la suma nuestra con la de BigInteger", numero.toString(), Utils.listToString(result));
		System.out.println();
	}

}
