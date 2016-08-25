package operaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Funciones para la suma de números representados como listas de enteros
 */
public class Multiplicacion {

	/**
	 * Multiplica dos números representados como listas de enteros
	 * @param num1 lista de enteros que representa un número
	 * @param num2 lista de enteros que representa otro número
	 * @return lista de enteros que representa la suma de los dos números
	 */
	public static List<Integer> multiplicar(List<Integer> num1, List<Integer> num2) {

		// deben ser números positivos
		List<Integer> result = new ArrayList<>(Collections.nCopies(num1.size() + num2.size(), 0));
		for (int i = num1.size() - 1; i >= 0; --i) {
			for (int j = num2.size() - 1; j >= 0; --j) {
				result.set(i + j + 1, result.get(i + j + 1) + num1.get(i) * num2.get(j));
				result.set(i + j, result.get(i + j) + result.get(i + j + 1) / 10);
				result.set(i + j + 1, result.get(i + j + 1) % 10);
			}
		}

		// Remueve los ceros al inicio
		int first_not_zero = 0;
		while (first_not_zero < result.size() && result.get(first_not_zero) == 0) {
			++first_not_zero;
		}
		result = result.subList(first_not_zero, result.size());
		
		// si, al quitar los ceros, la lista quedó vacia  
		if (result.isEmpty()) {
			// retorna cero
			return Arrays.asList(0);
		}
		return result;
	}
}