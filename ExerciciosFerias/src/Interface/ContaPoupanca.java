package Interface;

public class ContaPoupanca implements Conta {


	String titular;
	double saldo;
	
	ContaPoupanca (String titular, double saldo){
		this.titular = titular;
		this.saldo = saldo;
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saque(double valor) {
		this.saldo -= valor;
	}

}
