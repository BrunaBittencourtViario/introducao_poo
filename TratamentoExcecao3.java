package introducao_poo;

import java.util.Scanner;

public class TratamentoExcecao3 { //solução mais ROBUSTA e INTERESSANTE ao TratamentoExcecao2

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2;
		
		System.out.println("Digite dois valores: ");
		
		try {
			valor1=teclado.nextInt(); 
			try {
				valor2=teclado.nextInt();
				System.out.println("Os dois valores são válidos");
			} catch (Exception erro) {
				System.out.println("Valor 2 inválido");
			}
		} catch (Exception erro) {
			System.out.println("Valor 1 inválido");
		}
		
	}

}
