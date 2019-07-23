package classe_abstrata;

public class Gerente extends Funcionario {

	public double bonificacao() {
		double bonificacao;
		bonificacao = 0.1;
		return this.getSalario() * bonificacao;
		
		
	}

	
}
