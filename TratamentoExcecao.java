package introducao_poo;

import java.util.Scanner;

public class TratamentoExcecao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		try {
			System.out.println("Digite um n�mero: ");
			numero=teclado.nextInt();
			if (numero>=0 && numero<=50)
				System.out.println("� um n�mero que est� no intervalo");
			else
				System.out.println("� um n�mero que n�o est� no intervalo");
		} catch (Exception erro) {
			System.out.println("Voc� n�o digitou um n�mero");
		}
		
	}

}
