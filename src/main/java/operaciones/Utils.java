package operaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Utilidades para la manipulación de números representados como una lista de
 * enteros.
 */
public class Utils {

	// == generador de números
	
	/**
	 * Genera un número aleatorio de tamaño
	 * 
	 * @param len  cantidad de digitos del número
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

	// == Procesamiento de los números
	
	public static List<Integer> quitarCeros(List<Integer> numero) {
		int i = 0;
		while (i<numero.size() && numero.get(i)==0) {
			i++;
		};		
		if (i<numero.size()) {
			return numero.subList(i, numero.size());
		} else {
			return Arrays.asList(new Integer[]{0});
		}
	}
	
	// == Comparaciones
	
	public static boolean iguales (List<Integer> A, List<Integer> B) {
		A = quitarCeros(A);
		B = quitarCeros(B);
		
		if (A.size() != B.size()) {
			return false;
		} else {
			for (int i=0; i<A.size(); i++) {
				if (! A.get(i).equals(B.get(i)) ) {
					return false;
				}
			}
		}		
		return true;
	}
	
	public static boolean menor (List<Integer> A, List<Integer> B) {
		A = quitarCeros(A);
		B = quitarCeros(B);
		
		if (A.size() < B.size()) {
			return true;
		} else if (A.size() > B.size()) {
			return false;
		} else {
			int i=0;
			while(i<A.size() && A.get(i).equals(B.get(i))) { 
				i++;
			}
			if (i==A.size()) {
				return false; // son iguales
			} else if (A.get(i) < B.get(i)) {
				return true;
			} else {
				return false;
			}
		}		
	}
	
	public static boolean mayor (List<Integer> A, List<Integer> B) {
		A = quitarCeros(A);
		B = quitarCeros(B);
		
		if (A.size() < B.size()) {
			return false;
		} else if (A.size() > B.size()) {
			return true;
		} else {
			int i=0;
			while(i<A.size() && A.get(i).equals(B.get(i))) { 
				i++;
			}
			if (i==A.size()) {
				return false; // son iguales
			} else if (A.get(i) > B.get(i)) {
				return true;
			} else {
				return false;
			}
		}		
	}
	
	// == Conversiones
	
	/**
	 * Convierte una lista a una cadena
	 * 
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

	/**
	 * Convierte una cadena a una lista de digitos
	 * @param numero cadena con el número 
	 * @return el mismo número representado como una lista de enteros
	 * @throws Exception Error en la conversión del valor
	 */
	public static List<Integer> stringToList(String numero) throws Exception {
		List<Integer> A = new ArrayList<>();
		for (int i = 0; i < numero.length(); i++) {

		}
		return A;
	}

}
