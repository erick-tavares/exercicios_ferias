package Interface;

public class ContaCorrente implements Conta{

	String titular;
	double saldo;
	
	ContaCorrente(String titular, double saldo){
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
