package operaciones;

import java.util.ArrayList;
import java.util.List;

public class Resta {

	public static List<Integer> resta(List<Integer> A, List<Integer> B) throws UnsupportedOperationException {
		
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
