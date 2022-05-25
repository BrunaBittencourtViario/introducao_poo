package introducao_poo;

import java.util.Scanner;

public class TratamentoExcecao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		try {
			System.out.println("Digite um número: ");
			numero=teclado.nextInt();
			if (numero>=0 && numero<=50)
				System.out.println("É um número que está no intervalo");
			else
				System.out.println("É um número que não está no intervalo");
		} catch (Exception erro) {
			System.out.println("Você não digitou um número");
		}
		
	}

}
