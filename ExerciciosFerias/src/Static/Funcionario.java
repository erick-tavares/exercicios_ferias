package Static;

public class Funcionario {

	String nome;
	double salario;
	static double valeRefeicaoDiario = 15.0;
	
	void reajusteValeRefeicaoDiario(double taxa) {
		valeRefeicaoDiario += (valeRefeicaoDiario * taxa);
	}
}
