package introducao_poo;

public class AulaPessoaFisicaPrincipal {

	public static void main(String[] args) {
		
		AulaPessoaFisica pessoa = new AulaPessoaFisica();
		
		pessoa.setNome("Bruna");
		pessoa.setCpf("015.871.750-37");
		pessoa.setRg("012661192-38");
		pessoa.setIdade(30);
		pessoa.setEndereco("Rua Santa Flora");
		pessoa.setTelefone("(51)998377049");
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("RG: " + pessoa.getRg());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Endereço: " + pessoa.getEndereco());
		System.out.println("Telefone: " + pessoa.getTelefone());
		

	}

}
