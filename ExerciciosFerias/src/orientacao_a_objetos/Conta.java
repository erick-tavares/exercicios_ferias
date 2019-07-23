package orientacao_a_objetos;

public class Conta {

	int numConta;
	double saldo;
	double limite = 100.0;
	Agencia ag;
	
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
	
