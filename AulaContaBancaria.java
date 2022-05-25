package introducao_poo;

public class AulaContaBancaria {
	
	private String nomeProprietario, numeroAgencia, numeroConta;
	private double saldo;
	
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	 
	public void depositarValor (double valor) {
		 saldo += valor;
	 }
	public boolean sacarValor (double valor) {
		if (saldo>=valor) {
			saldo -= valor;
			return true;
		} else
			return false;
	}
	public double consultarSaldo () {
		return getSaldo();
	}
	public AulaContaBancaria (String nomeProprietario, String numeroAgencia, String numeroConta, double saldo) { //construtor
		setNomeProprietario (nomeProprietario);
		setNumeroAgencia (numeroAgencia);
		setNumeroConta (numeroConta);
		setSaldo (saldo);
	}
}
