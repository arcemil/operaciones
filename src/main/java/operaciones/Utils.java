package operaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Utilidades para la manipulación de números representados como 
 * una lista de enteros.
 */
public class Utils {

	/**
	 * Genera un número aleatorio de tamaño
	 * @param len cantidad de digitos del número
	 * @return lista que representa un número aleatorio
	 */
	public static List<Integer> randArray(int len) {
		// obtiene un generador de números aleatorios
		Random r = new Random();
		
		// si el tama�o es cero
		if (len == 0) {
			// retorna un arreglo con un cero
			return Arrays.asList(0);
		}
		
		// de lo contrario, crea una lista
		List<Integer> ret = new ArrayList<>();
		// agrega digitos a la lista
		ret.add(r.nextInt(9) + 1);
		--len;
		while (len-- != 0) {
			ret.add(r.nextInt(10));
		}
		// retorna la lista
		return ret;
	}

	/**
	 * Convierte una lista a una cadena
	 * @param A lista de enteros que representa un número
	 * @return Cadena que representa el número 
	 */
	public static String listToString(List<Integer> A) {
		StringBuilder result = new StringBuilder();
		for (int a : A) {
			result.append(a);
		}
		return result.toString();
	}
	
	public static List<Integer> stringToList(String numero) throws Exception {
		List<Integer> A = new ArrayList<>();
		for(int i=0; i<numero.length(); i++) {
			
		}
		return A;
	}

}
