package introducao_poo;

import java.util.Scanner;

public class AtividadeAvaliativa1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2, valor3, valor4, calculo;
				
		try {
			System.out.println("Digite o 1° valor: ");
			valor1 = teclado.nextInt();
			try {
				System.out.println("Digite o 2° valor: ");
				valor2 = teclado.nextInt();
				try {
					System.out.println("Digite o 3° valor: ");
					valor3 = teclado.nextInt();
					try {
						System.out.println("Digite o 4° valor: ");
						valor4 = teclado.nextInt();
						calculo = (valor1 / valor2 - valor3) * valor4;
						System.out.println("O Resultado é: " + calculo);
					} catch (Exception e) {
						System.out.println("O valor 4 é inválido");
					}
				} catch (Exception e) {
					
					System.out.println("O valor 3 é inválido");
				}
			} catch (Exception e) {
				System.out.println("O valor 2 é inválido");
			}
		} catch (Exception e) {
			System.out.println("O valor 1 é inválido");
		}
				
		teclado.close();

	}

}
