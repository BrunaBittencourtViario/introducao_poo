package introducao_poo;

import java.util.Scanner;

public class TratamentoExcecao2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2;
		
		try {
			System.out.println("Digite dois valores: ");
			valor1=teclado.nextInt(); //se digitar AQUI valor inv�lido N�O ENTRA no nextInt valor 2, j� aparecer� valor inv�lido.
			valor2=teclado.nextInt();
			System.out.println("Os dois valores s�o v�lidos");
		} catch (Exception erro) {
			System.out.println("Valor inv�lido");
		}
		
	}

}
