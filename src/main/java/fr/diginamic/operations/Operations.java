package fr.diginamic.operations;

// Classe qui fait l'operation de deux variable avec un opérateur en char

public class Operations {

	public static double calcul(double a, double b, char Op) {
		double res= 0.0d;
		
		if (Op=='+'){
				return (a + b);
		}
		else if (Op == '-') {
			return (a - b);
		}
		else if (Op == '*') {
			return (a * b);
		}
		else if (Op == '/') {
			return (a / b);
		}
		return res;
	}
}
	
		
