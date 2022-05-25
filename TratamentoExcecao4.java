package introducao_poo;

import java.util.Scanner;

public class TratamentoExcecao4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		boolean excecao=true;
		
		while (excecao==true) {
		try {
			System.out.println("Informe um valor");
			valor=sc.nextInt();
			System.out.println("Valor válido");
			excecao=false;
		} catch (Exception erro) {
			System.out.println("Valor inválido");
			sc.next().charAt(0); //limpa o buffer do teclado (memória temporária)
		}
		
		}

	}

}
