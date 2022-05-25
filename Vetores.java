package introducao_poo;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
			for (int i=0; i<n; i++) {
			soma +=	vect[i];
		}
		double resultado = soma/n;
		
		System.out.printf("Altura M�dia: %.2f%n", resultado);
		sc.close();
	}

}
