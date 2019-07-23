package polimorfismo;

public class Conta {

	private String titular;
	private double saldo;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	void gerarExtrato () {
		System.out.println("Saldo: " + this.saldo);
	}
	
	public void deposito(double valor) {
	}
	
	public void saque(double valor) {
	}
}
