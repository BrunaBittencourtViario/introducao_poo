package introducao_poo;

import entities.AccountHeranca;
import entities.AccountHerancaBusiness;
import entities.AccountHerancaSavings;

public class AccountHerancaProgram {

	public static void main(String[] args) {
		
		AccountHeranca acc = new AccountHeranca(1001, "Bruna", 0.0);
		AccountHerancaBusiness bacc = new AccountHerancaBusiness (1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		AccountHeranca acc1 = bacc;
		AccountHeranca acc2 = new AccountHerancaBusiness(1003, "Alex", 0.0, 200.0);
		AccountHeranca acc3 = new AccountHerancaSavings (1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING
		AccountHerancaBusiness acc4 = (AccountHerancaBusiness) acc2;
		acc4.loan(100.0);
		
		// AccountHerancaBusiness acc5 = (AccountHerancaBusiness) acc3; ERRO
		if (acc3 instanceof AccountHerancaBusiness) {
			AccountHerancaBusiness acc5 = (AccountHerancaBusiness) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof AccountHerancaSavings) {
			AccountHerancaSavings acc5 = (AccountHerancaSavings) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}

}
