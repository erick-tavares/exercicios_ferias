package orientacao_a_objetos;

public class Conta {

	private int numConta;
	private double saldo;
	private double limite = 100.0;
	private Agencia ag;
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Agencia getAg() {
		return ag;
	}

	public void setAg(Agencia ag) {
		this.ag = ag;
	}

	Conta (int numConta, double saldo, double limite, Agencia ag){
		this.numConta = numConta;
		this.saldo = saldo;
		this.limite = limite;
		this.ag = ag;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		this.saldo -= valor;
	}
	
	public void impressaoDeExtrato() {
		System.out.println("Saldo: "+ this.saldo);
	}
	
	public double consultaSaldo() {
		return this.saldo + this.limite;
	}
	
	public void transferencia(Conta destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
}
	
