package Static;

public class Conta {

	static int contador;
	int numeroDeConta;
	
	Conta (){
		contador++;
		this.numeroDeConta = Conta.contador;
	}
}
