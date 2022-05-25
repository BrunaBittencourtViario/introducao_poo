package introducao_poo;

import java.util.Scanner;

public class TratamentoExcecao2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2;
		
		try {
			System.out.println("Digite dois valores: ");
			valor1=teclado.nextInt(); //se digitar AQUI valor inválido NÃO ENTRA no nextInt valor 2, já aparecerá valor inválido.
			valor2=teclado.nextInt();
			System.out.println("Os dois valores são válidos");
		} catch (Exception erro) {
			System.out.println("Valor inválido");
		}
		
	}

}
