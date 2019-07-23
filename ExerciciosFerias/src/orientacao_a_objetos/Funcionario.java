package orientacao_a_objetos;

import util.Teclado;

public class Funcionario {

	private String nome;
	private double salario = 1000.0;
	
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
	public void dadosFuncionario() {
		System.out.println(this.nome + ". Sal�rio: " +this.salario);
	}
	public void dadosFuncionario(String nome, double salario) {
		this.nome = Teclado.lerTexto("Digite o nome do funcion�rio");
		this.salario = Teclado.lerDouble("Digite o sal�rio do funcion�rio");
	}
	public double aumentaSalario(double aumento) {
		return this.salario += aumento;
	}
}
