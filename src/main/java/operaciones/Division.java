package operaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Funciones para la división de números representados como listas de enteros
 */
public class Division {

	
	/**
	 * Divide dos números representados como arreglos de enteros
	 * @param A número representado como un arreglo de enteros
	 * @param B otro número representado como un arreglo de enteros
	 * @return El primer número dividido por el segundo
	 * @throws IllegalArgumentException error cuando se intenta dividir por cero
	 */
	public static List<Integer> dividir(List<Integer> A, List<Integer> B) throws IllegalArgumentException {
		//ivan:complejidad n
		A = Utils.quitarCeros(A);
		B = Utils.quitarCeros(B);
		
		//ivan:complejidad 1
		// no se puede dividir por 0
		if (B.equals(Arrays.asList(0))) {
			throw new IllegalArgumentException("No se puede dividir por cero");
		}
		
		//ivan:complejidad n
		// si A es menor que B, la división da 0 y el residuo da A
		if (Utils.menor(A, B)) {
			return Arrays.asList(0);
		}
		
		
		List<Integer> R = new ArrayList<>();
		
		//ivan:complejidad n^2
		List<Integer> parte = obtenerPrimeraParte(A,B);
		int pos = parte.size();

		int valor = dividirParte(parte, B);
		R.add(valor);
		
		//ivan:complejidad n^2
		while (pos < A.size()) {
			parte = new ArrayList<>(residuoParte(parte, B));
			parte.add(parte.size(), A.get(pos));
			pos++;
			
			valor = dividirParte(parte, B);
			R.add(valor);
		};

		return R;		
	}
	
	// == funciones usadas internamente
	//ivan:complejidad n^2
	protected static List<Integer> obtenerPrimeraParte(List<Integer> A, List<Integer> B) {
		List<Integer> parte;		
		int pos = B.size();
		do {
			parte = A.subList(0, pos);
			pos++;
		} while (Utils.menor(parte, B));
		return parte;
	}
	
	//ivan:complejidad n^2
	protected static int dividirParte(List<Integer> A, List<Integer> B) {
		int res = 0;
		while (!Utils.menor(A,B)) {
			A = Resta.restar(A, B);
			res++;
		}
		return res;
	}
	protected static int dividirParte2(List<Integer> A, List<Integer> B) {
		int res = 0;
		while (res<=9) {
			
			while (!Utils.menor(A,B)) {
						int contador=1;						
						B=Multiplicacion.multiplicar(A,B);						

			}
			
			res++;
		}
		
		return res;
	}
	
	//ivan:complejidad n^2
	protected static List<Integer> residuoParte(List<Integer> A, List<Integer> B) {
		while (!Utils.menor(A,B)) {
			A = Resta.restar(A, B);
		}
		return A;
	}
}
