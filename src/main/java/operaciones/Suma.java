package operaciones;

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

}
