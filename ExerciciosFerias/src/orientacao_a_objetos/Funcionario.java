package orientacao_a_objetos;

public class Funcionario {

	String nome;
	double salario;
	
	public void dadosFuncionario() {
		System.out.println(this.nome + ". Salário: " +this.salario);
	}
	public double aumentaSalario(double aumento) {
		return this.salario += aumento;
	}
}
