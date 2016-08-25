package operaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Multiplicacion {

	
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

		// Remove the leading zeroes.
		int first_not_zero = 0;
		while (first_not_zero < result.size() && result.get(first_not_zero) == 0) {
			++first_not_zero;
		}
		result = result.subList(first_not_zero, result.size());
		if (result.isEmpty()) {
			return Arrays.asList(0);
		}
		return result;
	}
}