package Static;

public class Funcionario {

	private String nome;
	private double salario;
	static double valeRefeicaoDiario = 15.0;
	
	void reajusteValeRefeicaoDiario(double taxa) {
		valeRefeicaoDiario += (valeRefeicaoDiario * taxa);
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


public double bonificacao() {
	double valor = 0.10;
	return this.salario *= valor;
}

public void exibeDados() {
	System.out.println("Nome: "+getNome ()+". Salário: " + getSalario() + ". Bonificação: "+bonificacao ());
}
}