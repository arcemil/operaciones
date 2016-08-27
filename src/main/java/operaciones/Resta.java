package operaciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Funciones para la resta de números representados como listas de enteros
 */
public class Resta {

	/**
	 * Resta dos números representados como arreglos de enteros
	 * @param A número representado como un arreglo de enteros
	 * @param B otro número representado como arreglo de enteros
	 * @return valor del primer número menos el segundo
	 * @throws UnsupportedOperationException Error si A es menor que B
	 */
	//ivan:complejidad n^2
	public static List<Integer> restar(List<Integer> A, List<Integer> B) throws UnsupportedOperationException {
		
		A = Utils.quitarCeros(A);
		B = Utils.quitarCeros(B);
		
		if (Utils.menor(A, B)) {
			throw new UnsupportedOperationException("No puedo restar a un número, un número mayor");
		}
		
		List<Integer> R = new ArrayList<>();
		
		// empieza por los digitos menos significativos
		int n = A.size() - 1;
		int m = B.size() - 1;
		
		// inicializa borrow en 0
		int borrow = 0;
		int digit = 0;
		
		// recorre todos los digitos de los dos números
		while (n >= 0 && m >= 0) {
			
			if ((A.get(n) - borrow) >= B.get(m)) {
				digit = (A.get(n) - borrow - B.get(m));
				borrow = 0;
			} else {
				digit = ((A.get(n) + 10) - borrow - B.get(m));
				borrow = 1;
			}
			
			R.add(0,digit);
			n--;
			m--;
		}
		// todavia hay digitos en A ?
		while (n>=0) {
			if (A.get(n) >= borrow) {
				digit = (A.get(n) - borrow);
				borrow = 0;
			} else {
				digit = ((A.get(n) + 10) - borrow);
				borrow = 1;
			}
			R.add(0,digit);
			n--;
		}
		// al final, hay un uno en el borrow ?
		if (borrow == 1) {
			// no deberia pasar
			throw new UnsupportedOperationException("No puedo restar a un número, un número mayor");
		}

		// retorna el resultado
		return Utils.quitarCeros(R);	
	}	
	
}
