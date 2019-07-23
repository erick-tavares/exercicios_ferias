package orientacao_a_objetos;

public class Gerente {

	String nome;
	double salario;
	
	 void aumentaSalario() {
		this.salario += (this.salario * 0.1);
	}
	void aumentaSalario(double taxa) {
		this.salario += (this.salario * taxa);
	}
}
