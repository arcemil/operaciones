package operaciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Funciones para la suma de números representados como listas de enteros
 */
public class Suma {

	/**
	 * Suma un uno a un número representado como una lista de enteros
	 * @param A lista de enteros que representa un número
	 * @return lista de enteros que representa el número más uno
	 */
	public static List<Integer> sumaUno(List<Integer> A) {
		
		// toma el digito menos significativo (en la última posición)
		int n = A.size() - 1;
		// le suma uno
		A.set(n, A.get(n) + 1);
		
		// si el valor se torna 10
		for (int i = n; i > 0 && A.get(i) == 10; --i) {
			// cambia el valor por un cero
			A.set(i, 0);
			// y agrega uno al siguiente digito 
			A.set(i - 1, A.get(i - 1) + 1);
		}
		
		// el digito más significativo (en la primera posición es 10) ?
		if (A.get(0) == 10) {
			// cambia el valor por creo
			A.set(0, 0);
			// agregar un uno al principio
			A.add(0, 1);
		}
		
		// retorna el número
		return A;
	}

	public static List<Integer> suma(List<Integer> A, List<Integer> B) {
		
		// int Rsize = Math.max(A.size(), B.size()) + 1;
		// List<Integer> R = new ArrayList<>(Collections.nCopies(Rsize, 0));
		
		List<Integer> R = new ArrayList<>();
		
		// empieza por los digitos menos significativos
		int n = A.size() - 1;
		int m = B.size() - 1;
		
		// inicializa carry en 0
		int carry = 0;
		int digit = 0;
		
		// recorre todos los digitos de los dos números
		while (n >= 0 && m >= 0 ) {
			digit = (A.get(n) + B.get(m) + carry)%10;
			carry = (A.get(n) + B.get(m) + carry)/10;
			
			R.add(0,digit);
			n--;
			m--;
		}
		
		while (n>=0) {
			digit = (A.get(n) + carry)%10;
			carry = (A.get(n) + carry)/10;		
			R.add(0,digit);
			n--;
		}
		
		while (m>=0) {
			digit = (B.get(n) + carry)%10;
			carry = (B.get(n) + carry)/10;		
			R.add(0,digit);
			m--;
		}
		
		if (carry == 1) {
			R.add(0, carry);
		}

		return R;
	
	}
	
}
