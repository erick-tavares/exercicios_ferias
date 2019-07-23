package Static;

public class Telefonista extends Funcionario{

	private String cdEstacao;

	public String getCdEstacao() {
		return cdEstacao;
	}

	public void setCdEstacao(String cdEstacao) {
		this.cdEstacao = cdEstacao;
	}
	public void exibeDados() {
		System.out.println("Nome: "+getNome ()+". Salário: " + getSalario() + ". Bonificação: "+bonificacao ()+ ". Código da estação de trabalho: " + getCdEstacao());
	}
	
}
