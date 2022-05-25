package introducao_poo;

import entities.AccountHeranca;
import entities.AccountHerancaBusiness;
import entities.AccountHerancaSavings;

public class AccountSobreposicaoProgram {

	public static void main(String[] args) {
		AccountHeranca acc1 = new AccountHeranca(1001, "Bruna", 1000.0); //Com taxa de 5.00 para saque.
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		AccountHeranca acc2 = new AccountHerancaSavings(1002, "Maria", 1000.0, 0.01); //Savings = poupança: sem taxa para saque.
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		AccountHeranca acc3 = new AccountHerancaBusiness(1003, "Alex", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
