package Static;

public class Gerente extends Funcionario{

	private String nome;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double bonificacao() {
		double valor = 0.15;
		return this.getSalario() * valor;
	}
	
	public void exibeDados() {
		System.out.println("Nome: "+getNome ()+". Salário: " + getSalario() + ". Bonificação: "+bonificacao () +". Senha: " + getSenha());
	}

}
