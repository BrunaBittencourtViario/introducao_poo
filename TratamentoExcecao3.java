package introducao_poo;

import java.util.Scanner;

public class TratamentoExcecao3 { //solu��o mais ROBUSTA e INTERESSANTE ao TratamentoExcecao2

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2;
		
		System.out.println("Digite dois valores: ");
		
		try {
			valor1=teclado.nextInt(); 
			try {
				valor2=teclado.nextInt();
				System.out.println("Os dois valores s�o v�lidos");
			} catch (Exception erro) {
				System.out.println("Valor 2 inv�lido");
			}
		} catch (Exception erro) {
			System.out.println("Valor 1 inv�lido");
		}
		
	}

}
