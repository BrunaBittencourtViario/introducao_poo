package introducao_poo;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetores_program;

public class ProgramVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Vetores_program[] vect = new Vetores_program[n];
		
		for(int i=0; i<n; i++) { // i<n é igual a: i<vect.lenght
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Vetores_program(name, price);
		}
		
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma += vect[i].getPrice();
		}
		
		double result = soma/n;
		System.out.printf("Média dos Produtos: R$ %.2f%n", result);
		
	sc.close();	
	}

}
