package Interface;

public class ContaPoupanca implements Conta {


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

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saque(double valor) {
		this.saldo -= valor;
	}

}
