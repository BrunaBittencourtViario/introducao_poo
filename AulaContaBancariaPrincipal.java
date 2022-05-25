package introducao_poo;

public class AulaContaBancariaPrincipal {
	public static void main(String[] args) {
		
		AulaContaBancariaPrincipal.imprimeSaldo();
		
	}
	
	private static void imprimeSaldo() {
		AulaContaBancaria conta = new AulaContaBancaria("Bruna", "5526-46", "46464-67", 0);
		conta.depositarValor(3000);
		System.out.println("Saldo atual: " + conta.getSaldo());
		conta.sacarValor(1000);
		System.out.println("Saldo atual: " + conta.getSaldo());
	}

}
