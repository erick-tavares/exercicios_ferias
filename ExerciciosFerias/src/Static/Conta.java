package Static;

public class Conta {

	static int contador;
	int numeroDeConta;
	
	Conta (){
		contador++;
		this.numeroDeConta = Conta.contador;
	}
	static void zerarContador() {
		System.out.println("Nùmero de contas anteriores: " + Conta.contador);
		contador = 0;
		System.out.println("Nùmero de contas atuais: " + Conta.contador);
	}
}
